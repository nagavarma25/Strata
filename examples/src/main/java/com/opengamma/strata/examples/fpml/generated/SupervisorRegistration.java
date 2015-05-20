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
 * Provides information about a regulator or other supervisory body that an organization is registered with.
 * 
 * <p>Java class for SupervisorRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupervisorRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/pretrade}SupervisorRegistration.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupervisorRegistration", propOrder = {
    "supervisoryBody",
    "registrationNumber"
})
public class SupervisorRegistration {

    protected SupervisoryBody supervisoryBody;
    protected RegulatorId registrationNumber;

    /**
     * Gets the value of the supervisoryBody property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisoryBody }
     *     
     */
    public SupervisoryBody getSupervisoryBody() {
        return supervisoryBody;
    }

    /**
     * Sets the value of the supervisoryBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisoryBody }
     *     
     */
    public void setSupervisoryBody(SupervisoryBody value) {
        this.supervisoryBody = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatorId }
     *     
     */
    public RegulatorId getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatorId }
     *     
     */
    public void setRegistrationNumber(RegulatorId value) {
        this.registrationNumber = value;
    }

}
