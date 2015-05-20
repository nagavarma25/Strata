//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.20 at 01:28:29 PM CDT 
//


package com.opengamma.strata.examples.fpml.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing a set of dates defined as relative to another set of dates.
 * 
 * <p>Java class for RelativeDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativeDates">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/pretrade}RelativeDateOffset">
 *       &lt;sequence>
 *         &lt;element name="periodSkip" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="scheduleBounds" type="{http://www.fpml.org/FpML-5/pretrade}DateRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeDates", propOrder = {
    "periodSkip",
    "scheduleBounds"
})
public class RelativeDates
    extends RelativeDateOffset
{

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger periodSkip;
    protected DateRange scheduleBounds;

    /**
     * Gets the value of the periodSkip property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeriodSkip() {
        return periodSkip;
    }

    /**
     * Sets the value of the periodSkip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeriodSkip(BigInteger value) {
        this.periodSkip = value;
    }

    /**
     * Gets the value of the scheduleBounds property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getScheduleBounds() {
        return scheduleBounds;
    }

    /**
     * Sets the value of the scheduleBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setScheduleBounds(DateRange value) {
        this.scheduleBounds = value;
    }

}
