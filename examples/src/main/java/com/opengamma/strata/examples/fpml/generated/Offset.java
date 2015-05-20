//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.20 at 01:28:29 PM CDT 
//


package com.opengamma.strata.examples.fpml.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining an offset used in calculating a new date relative to a reference date. E.g. calendar days, business days, Commodity Business days, etc..
 * 
 * <p>Java class for Offset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Offset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/pretrade}Period">
 *       &lt;sequence>
 *         &lt;element name="dayType" type="{http://www.fpml.org/FpML-5/pretrade}DayTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Offset", propOrder = {
    "dayType"
})
@XmlSeeAlso({
    FxFixingDate.class,
    RelativeDateOffset.class
})
public class Offset
    extends Period
{

    @XmlSchemaType(name = "token")
    protected DayTypeEnum dayType;

    /**
     * Gets the value of the dayType property.
     * 
     * @return
     *     possible object is
     *     {@link DayTypeEnum }
     *     
     */
    public DayTypeEnum getDayType() {
        return dayType;
    }

    /**
     * Sets the value of the dayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypeEnum }
     *     
     */
    public void setDayType(DayTypeEnum value) {
        this.dayType = value;
    }

}
