//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.20 at 01:28:29 PM CDT 
//


package com.opengamma.strata.examples.fpml.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type to provide the ability to point to multiple payment nodes in the document through the unbounded paymentDatesReference.
 * 
 * <p>Java class for DateRelativeToCalculationPeriodDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateRelativeToCalculationPeriodDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationPeriodDatesReference" type="{http://www.fpml.org/FpML-5/pretrade}CalculationPeriodDatesReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRelativeToCalculationPeriodDates", propOrder = {
    "calculationPeriodDatesReference"
})
public class DateRelativeToCalculationPeriodDates {

    protected List<CalculationPeriodDatesReference> calculationPeriodDatesReference;

    /**
     * Gets the value of the calculationPeriodDatesReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculationPeriodDatesReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculationPeriodDatesReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalculationPeriodDatesReference }
     * 
     * 
     */
    public List<CalculationPeriodDatesReference> getCalculationPeriodDatesReference() {
        if (calculationPeriodDatesReference == null) {
            calculationPeriodDatesReference = new ArrayList<CalculationPeriodDatesReference>();
        }
        return this.calculationPeriodDatesReference;
    }

}
