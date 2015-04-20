/**
 * Copyright (C) 2014 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.strata.pricer.impl.rate.swap;

import com.opengamma.strata.collect.ArgChecker;
import com.opengamma.strata.finance.rate.swap.PaymentPeriod;
import com.opengamma.strata.finance.rate.swap.RatePaymentPeriod;
import com.opengamma.strata.pricer.PricingEnvironment;
import com.opengamma.strata.pricer.rate.swap.PaymentPeriodPricer;

/**
 * Pricer implementation for payment periods using multiple dispatch.
 * <p>
 * Dispatches the request to the correct implementation.
 */
public class DispatchingPaymentPeriodPricer
    implements PaymentPeriodPricer<PaymentPeriod> {

  /**
   * Default implementation.
   */
  public static final DispatchingPaymentPeriodPricer DEFAULT = new DispatchingPaymentPeriodPricer(
      DiscountingRatePaymentPeriodPricer.DEFAULT);

  /**
   * Pricer for {@link RatePaymentPeriod}.
   */
  private final PaymentPeriodPricer<RatePaymentPeriod> ratePaymentPeriodPricer;

  /**
   * Creates an instance.
   * 
   * @param ratePaymentPeriodPricer  the pricer for {@link RatePaymentPeriod}
   */
  public DispatchingPaymentPeriodPricer(
      PaymentPeriodPricer<RatePaymentPeriod> ratePaymentPeriodPricer) {
    this.ratePaymentPeriodPricer = ArgChecker.notNull(ratePaymentPeriodPricer, "ratePaymentPeriodPricer");
  }

  //-------------------------------------------------------------------------
  @Override
  public double presentValue(PricingEnvironment env, PaymentPeriod paymentPeriod) {
    // dispatch by runtime type
    if (paymentPeriod instanceof RatePaymentPeriod) {
      return ratePaymentPeriodPricer.presentValue(env, (RatePaymentPeriod) paymentPeriod);
    } else {
      throw new IllegalArgumentException("Unknown PaymentPeriod type: " + paymentPeriod.getClass().getSimpleName());
    }
  }

  @Override
  public double futureValue(PricingEnvironment env, PaymentPeriod paymentPeriod) {
    // dispatch by runtime type
    if (paymentPeriod instanceof RatePaymentPeriod) {
      return ratePaymentPeriodPricer.futureValue(env, (RatePaymentPeriod) paymentPeriod);
    } else {
      throw new IllegalArgumentException("Unknown PaymentPeriod type: " + paymentPeriod.getClass().getSimpleName());
    }
  }

}