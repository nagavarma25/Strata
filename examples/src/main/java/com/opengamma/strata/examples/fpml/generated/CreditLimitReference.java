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
 * <p>Java class for CreditLimitReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditLimitReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvingPartyReference" type="{http://www.fpml.org/FpML-5/pretrade}PartyReference" minOccurs="0"/>
 *         &lt;element name="approvalId" type="{http://www.fpml.org/FpML-5/pretrade}ApprovalId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLimitReference", propOrder = {
    "approvingPartyReference",
    "approvalId"
})
public class CreditLimitReference {

    protected PartyReference approvingPartyReference;
    protected ApprovalId approvalId;

    /**
     * Gets the value of the approvingPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getApprovingPartyReference() {
        return approvingPartyReference;
    }

    /**
     * Sets the value of the approvingPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setApprovingPartyReference(PartyReference value) {
        this.approvingPartyReference = value;
    }

    /**
     * Gets the value of the approvalId property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalId }
     *     
     */
    public ApprovalId getApprovalId() {
        return approvalId;
    }

    /**
     * Sets the value of the approvalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalId }
     *     
     */
    public void setApprovalId(ApprovalId value) {
        this.approvalId = value;
    }

}
