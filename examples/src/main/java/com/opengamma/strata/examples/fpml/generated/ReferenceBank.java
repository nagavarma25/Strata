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
 * A type to describe an institution (party) identified by means of a coding scheme and an optional name.
 * 
 * <p>Java class for ReferenceBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceBank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceBankId" type="{http://www.fpml.org/FpML-5/pretrade}ReferenceBankId" minOccurs="0"/>
 *         &lt;element name="referenceBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceBank", propOrder = {
    "referenceBankId",
    "referenceBankName"
})
public class ReferenceBank {

    protected ReferenceBankId referenceBankId;
    protected String referenceBankName;

    /**
     * Gets the value of the referenceBankId property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceBankId }
     *     
     */
    public ReferenceBankId getReferenceBankId() {
        return referenceBankId;
    }

    /**
     * Sets the value of the referenceBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceBankId }
     *     
     */
    public void setReferenceBankId(ReferenceBankId value) {
        this.referenceBankId = value;
    }

    /**
     * Gets the value of the referenceBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceBankName() {
        return referenceBankName;
    }

    /**
     * Sets the value of the referenceBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceBankName(String value) {
        this.referenceBankName = value;
    }

}
