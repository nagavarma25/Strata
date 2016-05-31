/**
 * Copyright (C) 2015 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.strata.function.marketdata.scenario.curve;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.opengamma.strata.calc.marketdata.scenario.MarketDataFilter;
import com.opengamma.strata.data.scenario.MarketDataBox;
import com.opengamma.strata.market.curve.Curve;
import com.opengamma.strata.market.curve.CurveName;
import com.opengamma.strata.market.id.CurveId;

/**
 * A market data filter which matches a curve by name.
 * <p>
 * The {@link #matches} method returns true if the curve name equals the one specified on construction.
 */
@BeanDefinition(builderScope = "private")
public final class CurveNameFilter
    implements MarketDataFilter<Curve, CurveId>, ImmutableBean {

  /**
   * The name of the curve matched by this filter.
   */
  @PropertyDefinition(validate = "notNull")
  private final CurveName curveName;

  //-------------------------------------------------------------------------
  /**
   * Returns a filter matching curves with the specified name.
   *
   * @param curveName  the name of the curve matched by this filter
   * @return a filter matching curves with the specified name
   */
  public static CurveNameFilter of(CurveName curveName) {
    return new CurveNameFilter(curveName);
  }

  //-------------------------------------------------------------------------

  @Override
  public Class<?> getMarketDataIdType() {
    return CurveId.class;
  }

  @Override
  public boolean matches(CurveId marketDataId, MarketDataBox<Curve> marketData) {
    Curve curve = marketData.getValue(0);
    return curve.getName().equals(curveName);

  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code CurveNameFilter}.
   * @return the meta-bean, not null
   */
  public static CurveNameFilter.Meta meta() {
    return CurveNameFilter.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(CurveNameFilter.Meta.INSTANCE);
  }

  private CurveNameFilter(
      CurveName curveName) {
    JodaBeanUtils.notNull(curveName, "curveName");
    this.curveName = curveName;
  }

  @Override
  public CurveNameFilter.Meta metaBean() {
    return CurveNameFilter.Meta.INSTANCE;
  }

  @Override
  public <R> Property<R> property(String propertyName) {
    return metaBean().<R>metaProperty(propertyName).createProperty(this);
  }

  @Override
  public Set<String> propertyNames() {
    return metaBean().metaPropertyMap().keySet();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the name of the curve matched by this filter.
   * @return the value of the property, not null
   */
  public CurveName getCurveName() {
    return curveName;
  }

  //-----------------------------------------------------------------------
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      CurveNameFilter other = (CurveNameFilter) obj;
      return JodaBeanUtils.equal(curveName, other.curveName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(curveName);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(64);
    buf.append("CurveNameFilter{");
    buf.append("curveName").append('=').append(JodaBeanUtils.toString(curveName));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code CurveNameFilter}.
   */
  public static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code curveName} property.
     */
    private final MetaProperty<CurveName> curveName = DirectMetaProperty.ofImmutable(
        this, "curveName", CurveNameFilter.class, CurveName.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "curveName");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 771153946:  // curveName
          return curveName;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends CurveNameFilter> builder() {
      return new CurveNameFilter.Builder();
    }

    @Override
    public Class<? extends CurveNameFilter> beanType() {
      return CurveNameFilter.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code curveName} property.
     * @return the meta-property, not null
     */
    public MetaProperty<CurveName> curveName() {
      return curveName;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 771153946:  // curveName
          return ((CurveNameFilter) bean).getCurveName();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code CurveNameFilter}.
   */
  private static final class Builder extends DirectFieldsBeanBuilder<CurveNameFilter> {

    private CurveName curveName;

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 771153946:  // curveName
          return curveName;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 771153946:  // curveName
          this.curveName = (CurveName) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public Builder set(MetaProperty<?> property, Object value) {
      super.set(property, value);
      return this;
    }

    @Override
    public Builder setString(String propertyName, String value) {
      setString(meta().metaProperty(propertyName), value);
      return this;
    }

    @Override
    public Builder setString(MetaProperty<?> property, String value) {
      super.setString(property, value);
      return this;
    }

    @Override
    public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
      super.setAll(propertyValueMap);
      return this;
    }

    @Override
    public CurveNameFilter build() {
      return new CurveNameFilter(
          curveName);
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(64);
      buf.append("CurveNameFilter.Builder{");
      buf.append("curveName").append('=').append(JodaBeanUtils.toString(curveName));
      buf.append('}');
      return buf.toString();
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}
