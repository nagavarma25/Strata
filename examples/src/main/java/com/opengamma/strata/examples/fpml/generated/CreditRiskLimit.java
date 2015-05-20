//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.20 at 01:28:29 PM CDT 
//


package com.opengamma.strata.examples.fpml.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditRiskLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRiskLimit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="fullApproval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;sequence>
 *             &lt;element name="requestedNotionalAmount" type="{http://www.fpml.org/FpML-5/pretrade}Money" minOccurs="0"/>
 *             &lt;element name="approvedNotionalAmount" type="{http://www.fpml.org/FpML-5/pretrade}Money" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="requestedNumberOfOptions" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *             &lt;element name="approvedNumberOfOptions" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="requestedNumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *             &lt;element name="approvedNumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="reason" type="{http://www.fpml.org/FpML-5/pretrade}CreditLimitCheckReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="limitExpiryTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creditLimitReference" type="{http://www.fpml.org/FpML-5/pretrade}CreditLimitReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="originalRequestDetails" type="{http://www.fpml.org/FpML-5/pretrade}OriginalRequestDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditRiskLimit", propOrder = {
    "fullApproval",
    "requestedNotionalAmount",
    "approvedNotionalAmount",
    "requestedNumberOfOptions",
    "approvedNumberOfOptions",
    "requestedNumberOfUnits",
    "approvedNumberOfUnits",
    "reason",
    "limitExpiryTimeStamp",
    "creditLimitReference",
    "originalRequestDetails"
})
public class CreditRiskLimit {

    protected Boolean fullApproval;
    protected Money requestedNotionalAmount;
    protected Money approvedNotionalAmount;
    protected BigDecimal requestedNumberOfOptions;
    protected BigDecimal approvedNumberOfOptions;
    protected BigDecimal requestedNumberOfUnits;
    protected BigDecimal approvedNumberOfUnits;
    protected List<CreditLimitCheckReason> reason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar limitExpiryTimeStamp;
    protected List<CreditLimitReference> creditLimitReference;
    protected OriginalRequestDetails originalRequestDetails;

    /**
     * Gets the value of the fullApproval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullApproval() {
        return fullApproval;
    }

    /**
     * Sets the value of the fullApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullApproval(Boolean value) {
        this.fullApproval = value;
    }

    /**
     * Gets the value of the requestedNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getRequestedNotionalAmount() {
        return requestedNotionalAmount;
    }

    /**
     * Sets the value of the requestedNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setRequestedNotionalAmount(Money value) {
        this.requestedNotionalAmount = value;
    }

    /**
     * Gets the value of the approvedNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getApprovedNotionalAmount() {
        return approvedNotionalAmount;
    }

    /**
     * Sets the value of the approvedNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setApprovedNotionalAmount(Money value) {
        this.approvedNotionalAmount = value;
    }

    /**
     * Gets the value of the requestedNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedNumberOfOptions() {
        return requestedNumberOfOptions;
    }

    /**
     * Sets the value of the requestedNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedNumberOfOptions(BigDecimal value) {
        this.requestedNumberOfOptions = value;
    }

    /**
     * Gets the value of the approvedNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprovedNumberOfOptions() {
        return approvedNumberOfOptions;
    }

    /**
     * Sets the value of the approvedNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovedNumberOfOptions(BigDecimal value) {
        this.approvedNumberOfOptions = value;
    }

    /**
     * Gets the value of the requestedNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedNumberOfUnits() {
        return requestedNumberOfUnits;
    }

    /**
     * Sets the value of the requestedNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedNumberOfUnits(BigDecimal value) {
        this.requestedNumberOfUnits = value;
    }

    /**
     * Gets the value of the approvedNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprovedNumberOfUnits() {
        return approvedNumberOfUnits;
    }

    /**
     * Sets the value of the approvedNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovedNumberOfUnits(BigDecimal value) {
        this.approvedNumberOfUnits = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditLimitCheckReason }
     * 
     * 
     */
    public List<CreditLimitCheckReason> getReason() {
        if (reason == null) {
            reason = new ArrayList<CreditLimitCheckReason>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the limitExpiryTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLimitExpiryTimeStamp() {
        return limitExpiryTimeStamp;
    }

    /**
     * Sets the value of the limitExpiryTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLimitExpiryTimeStamp(XMLGregorianCalendar value) {
        this.limitExpiryTimeStamp = value;
    }

    /**
     * Gets the value of the creditLimitReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditLimitReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditLimitReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditLimitReference }
     * 
     * 
     */
    public List<CreditLimitReference> getCreditLimitReference() {
        if (creditLimitReference == null) {
            creditLimitReference = new ArrayList<CreditLimitReference>();
        }
        return this.creditLimitReference;
    }

    /**
     * Gets the value of the originalRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalRequestDetails }
     *     
     */
    public OriginalRequestDetails getOriginalRequestDetails() {
        return originalRequestDetails;
    }

    /**
     * Sets the value of the originalRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalRequestDetails }
     *     
     */
    public void setOriginalRequestDetails(OriginalRequestDetails value) {
        this.originalRequestDetails = value;
    }

}
