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
 * <p>Java class for FailureToPay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureToPay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gracePeriodExtension" type="{http://www.fpml.org/FpML-5/pretrade}GracePeriodExtension" minOccurs="0"/>
 *         &lt;element name="paymentRequirement" type="{http://www.fpml.org/FpML-5/pretrade}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailureToPay", propOrder = {
    "applicable",
    "gracePeriodExtension",
    "paymentRequirement"
})
public class FailureToPay {

    protected Boolean applicable;
    protected GracePeriodExtension gracePeriodExtension;
    protected Money paymentRequirement;

    /**
     * Gets the value of the applicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicable(Boolean value) {
        this.applicable = value;
    }

    /**
     * Gets the value of the gracePeriodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link GracePeriodExtension }
     *     
     */
    public GracePeriodExtension getGracePeriodExtension() {
        return gracePeriodExtension;
    }

    /**
     * Sets the value of the gracePeriodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link GracePeriodExtension }
     *     
     */
    public void setGracePeriodExtension(GracePeriodExtension value) {
        this.gracePeriodExtension = value;
    }

    /**
     * Gets the value of the paymentRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPaymentRequirement() {
        return paymentRequirement;
    }

    /**
     * Sets the value of the paymentRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPaymentRequirement(Money value) {
        this.paymentRequirement = value;
    }

}
