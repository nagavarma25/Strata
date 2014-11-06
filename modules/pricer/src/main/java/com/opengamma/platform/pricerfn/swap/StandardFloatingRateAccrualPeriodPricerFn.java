/**
 * Copyright (C) 2014 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.platform.pricerfn.swap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import com.opengamma.OpenGammaRuntimeException;
import com.opengamma.analytics.financial.instrument.index.IndexONMaster;
import com.opengamma.basics.currency.CurrencyPair;
import com.opengamma.basics.index.OvernightIndex;
import com.opengamma.basics.index.RateIndex;
import com.opengamma.basics.index.RateIndexType;
import com.opengamma.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.platform.finance.swap.FloatingRateAccrualPeriod;
import com.opengamma.platform.pricer.PricingEnvironment;
import com.opengamma.platform.pricer.swap.FloatingRateAccrualPeriodPricerFn;

/**
 * Pricer implementation for floating rate swap accrual periods.
 * <p>
 * Fixed rate accrual periods are calculated by multiplying four elements:
 * <ul>
 * <li>the notional
 * <li>the FX rate, using 1 if there is no FX reset conversion
 * <li>the interest rate, which can be calculated in various ways
 * <li>the year fraction, based on the accrual period day count
 * </ul>
 */
public class StandardFloatingRateAccrualPeriodPricerFn
    implements FloatingRateAccrualPeriodPricerFn {

  @Override
  public double presentValue(
      PricingEnvironment env,
      LocalDate valuationDate,
      FloatingRateAccrualPeriod period,
      LocalDate paymentDate) {
    // futureValue * discountFactor
    double df = env.discountFactor(period.getCurrency(), valuationDate, paymentDate);
    return df * futureValue(env, valuationDate, period);
  }

  @Override
  public double futureValue(
      PricingEnvironment env,
      LocalDate valuationDate,
      FloatingRateAccrualPeriod period) {
    // find FX rate, using 1 if no FX reset occurs
    double fxRate = 1d;
    if (period.getFxReset() != null) {
      CurrencyPair pair = CurrencyPair.of(period.getFxReset().getReferenceCurrency(), period.getCurrency());
      fxRate = env.fxRate(period.getFxReset().getIndex(), pair, valuationDate, period.getFxReset().getFixingDate());
    }
    // calculated result
    double unitNotionalFactor;
    if (period.getIndexInterpolated() != null) {
      unitNotionalFactor = linearInterpolatedUnitNotional(env, valuationDate, period) * fxRate;
    } else if (period.getIndex().getType() == RateIndexType.OVERNIGHT) {
      unitNotionalFactor = overnightUnitNotional(env, valuationDate, period) * fxRate;
    } else {
      unitNotionalFactor = normalUnitNotional(env, valuationDate, period) * fxRate;
    }
    return period.getNotional() * fxRate * unitNotionalFactor;
  }

  // simple floating Ibor
  private double normalUnitNotional(
      PricingEnvironment env,
      LocalDate valuationDate,
      FloatingRateAccrualPeriod period) {
    
    LocalDate fixingDate = period.getFixingDate();
    RateIndex index = period.getIndex();
    double rate = env.indexRate(index, valuationDate, fixingDate);
    double appliedRate = rate * period.getGearing() + period.getSpread();
    return appliedRate * period.getYearFraction();
  }

  // linear interpolation between 2 rates both applicable at the fixing date
  private double linearInterpolatedUnitNotional(
      PricingEnvironment env,
      LocalDate valuationDate,
      FloatingRateAccrualPeriod period) {
    
    LocalDate fixingDate = period.getFixingDate();
    RateIndex index1 = period.getIndex();
    RateIndex index2 = period.getIndexInterpolated();
    LocalDate fixingStartDate1 = index1.calculateEffectiveFromFixing(fixingDate);
    LocalDate fixingEndDate1 = index1.calculateMaturityFromEffective(fixingStartDate1);
    LocalDate fixingStartDate2 = index2.calculateEffectiveFromFixing(fixingDate);
    LocalDate fixingEndDate2 = index2.calculateMaturityFromEffective(fixingStartDate2);
    double rate1 = env.indexRate(index1, valuationDate, fixingDate);
    double rate2 = env.indexRate(index2, valuationDate, fixingDate);
    long fixingEpochDay = fixingDate.toEpochDay();
    double days1 = fixingEndDate1.toEpochDay() - fixingEpochDay;
    double days2 = fixingEndDate2.toEpochDay() - fixingEpochDay;
    double daysN = period.getEndDate().toEpochDay() - fixingEpochDay;
    double weight1 = (days2 - daysN) / (days2 - days1);
    double weight2 = (daysN - days1) / (days2 - days1);
    double rate = ((rate1 * weight1) + (rate2 * weight2)) / (weight1 + weight2);
    double appliedRate = rate * period.getGearing() + period.getSpread();
    return appliedRate * period.getYearFraction();
  }

  // overnight compounding
  private double overnightUnitNotional(
      PricingEnvironment env,
      LocalDate valuationDate,
      FloatingRateAccrualPeriod period) {
    
    if (period.getSpread() != 0d || period.getGearing() != 1d) {
      throw new UnsupportedOperationException("Spread and Gearing not supported with overnight compounding");
    }
    // TODO: why no multiply by period.getYearFraction()? only by fixing year fraction...
    // TODO: is publication date properly handled?
    
    RateIndex index = period.getIndex();
    // if no fixings apply, then only use forward rate
    final LocalDate firstPublicationDate = index.calculatePublicationFromFixing(period.getStartDate());
    if (valuationDate.isBefore(firstPublicationDate)) {
      double fixingStart = env.relativeTime(valuationDate, period.getStartDate());
      double fixingEnd = env.relativeTime(valuationDate, period.getEndDate());
      double fixingAccrualfactor = index.getDayCount().getDayCountFraction(period.getStartDate(), period.getEndDate());
      double rate = env.getMulticurve().getSimplyCompoundForwardRate(
          IndexONMaster.getInstance().getIndex("FED FUND"), fixingStart, fixingEnd, fixingAccrualfactor);
      return rate * fixingAccrualfactor;
    }
    // fixing periods, based on business days of the index
    final List<LocalDate> fixingDateList = new ArrayList<>();
    final List<Double> fixingAccrualFactorList = new ArrayList<>();
    LocalDate currentStart = period.getStartDate();
    fixingDateList.add(currentStart);
    while (currentStart.isBefore(period.getEndDate())) {
      LocalDate currentEnd = index.getFixingCalendar().next(currentStart);
      fixingDateList.add(currentEnd);
      fixingAccrualFactorList.add(index.getDayCount().getDayCountFraction(currentStart, currentEnd));
      currentStart = currentEnd;
    }
    // try accessing fixing time-series
    LocalDateDoubleTimeSeries indexFixingDateSeries = env.getTimeSeries(index);
    int fixedPeriod = 0;
    int publicationLag = ((OvernightIndex) index).getPublicationDateOffset();
    double accruedUnitNotional = 1d;
    // accrue notional for fixings before today, up to and including yesterday
    while ((fixedPeriod < fixingDateList.size() - 1) &&
        ((fixedPeriod + publicationLag) < fixingDateList.size()) &&
        valuationDate.isAfter(fixingDateList.get(fixedPeriod + publicationLag))) {
      LocalDate currentDate1 = fixingDateList.get(fixedPeriod);
      OptionalDouble fixedRate = indexFixingDateSeries.get(currentDate1);
      if (!fixedRate.isPresent()) {
        LocalDate latestDate = indexFixingDateSeries.getLatestDate();
        if (currentDate1.isAfter(latestDate)) {
          throw new OpenGammaRuntimeException("Could not get fixing value of index " + index.getName() +
              " for date " + currentDate1 + ". The last data is available on " + latestDate);
        }
        if (!fixedRate.isPresent()) {
          throw new OpenGammaRuntimeException("Could not get fixing value of index " + index.getName() +
              " for date " + currentDate1);
        }
      }
      accruedUnitNotional *= 1 + fixingAccrualFactorList.get(fixedPeriod) * fixedRate.getAsDouble();
      fixedPeriod++;
    }
    // accrue notional for fixings for today
    if (fixedPeriod < fixingDateList.size() - 1) {
      // Check to see if a fixing is available on current date
      OptionalDouble fixedRate = indexFixingDateSeries.get(fixingDateList.get(fixedPeriod));
      if (fixedRate.isPresent()) {
        accruedUnitNotional *= 1 + fixingAccrualFactorList.get(fixedPeriod) * fixedRate.getAsDouble();
        fixedPeriod++;
      }
    }
    // use forward curve for remainder
    if (fixedPeriod < fixingDateList.size() - 1) {
      // fixing period is the remaining time of the period
      final double fixingStart = env.relativeTime(valuationDate, fixingDateList.get(fixedPeriod));
      final double fixingEnd = env.relativeTime(valuationDate, fixingDateList.get(fixingDateList.size() - 1));
      double fixingAccrualFactorLeft = 0.0;
      for (int loopperiod = fixedPeriod; loopperiod < fixingAccrualFactorList.size(); loopperiod++) {
        fixingAccrualFactorLeft += fixingAccrualFactorList.get(loopperiod);
      }
      double rate = env.getMulticurve().getSimplyCompoundForwardRate(
          IndexONMaster.getInstance().getIndex("FED FUND"), fixingStart, fixingEnd, fixingAccrualFactorLeft);
      double ratio = 1d + fixingAccrualFactorLeft * rate;
      return (accruedUnitNotional * ratio - 1d);
    }
    // all fixed
    return (accruedUnitNotional - 1d);
  }

}