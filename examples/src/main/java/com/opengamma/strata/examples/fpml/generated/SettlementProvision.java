//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.20 at 01:28:29 PM CDT 
//


package com.opengamma.strata.examples.fpml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the specification of settlement terms, occuring when the settlement currency is different to the notional currency of the trade. - For use with pre-trade Credit Limit Check messages.
 * 
 * <p>Java class for SettlementProvision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementProvision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementCurrency" type="{http://www.fpml.org/FpML-5/pretrade}Currency" minOccurs="0"/>
 *         &lt;element name="nonDeliverableSettlement" type="{http://www.fpml.org/FpML-5/pretrade}NonDeliverableSettlement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementProvision", propOrder = {
    "settlementCurrency",
    "nonDeliverableSettlement"
})
public class SettlementProvision {

    protected Currency settlementCurrency;
    protected NonDeliverableSettlement nonDeliverableSettlement;

    /**
     * Gets the value of the settlementCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getSettlementCurrency() {
        return settlementCurrency;
    }

    /**
     * Sets the value of the settlementCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setSettlementCurrency(Currency value) {
        this.settlementCurrency = value;
    }

    /**
     * Gets the value of the nonDeliverableSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link NonDeliverableSettlement }
     *     
     */
    public NonDeliverableSettlement getNonDeliverableSettlement() {
        return nonDeliverableSettlement;
    }

    /**
     * Sets the value of the nonDeliverableSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDeliverableSettlement }
     *     
     */
    public void setNonDeliverableSettlement(NonDeliverableSettlement value) {
        this.nonDeliverableSettlement = value;
    }

}
