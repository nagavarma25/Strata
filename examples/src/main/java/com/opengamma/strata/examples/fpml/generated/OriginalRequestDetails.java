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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalRequestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestingPartyReference" type="{http://www.fpml.org/FpML-5/pretrade}PartyReference" minOccurs="0"/>
 *         &lt;element name="creditApprovalRequestType" type="{http://www.fpml.org/FpML-5/pretrade}CreditApprovalRequestTypeEnum" minOccurs="0"/>
 *         &lt;element name="creditApprovalModel" type="{http://www.fpml.org/FpML-5/pretrade}CreditApprovalModel" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="originalTrade" type="{http://www.fpml.org/FpML-5/pretrade}Trade"/>
 *           &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/pretrade}TradeIdentifier" maxOccurs="unbounded"/>
 *           &lt;element name="originalPackage" type="{http://www.fpml.org/FpML-5/pretrade}TradePackage"/>
 *           &lt;element name="packageIdentifier" type="{http://www.fpml.org/FpML-5/pretrade}IssuerTradeId"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalRequestDetails", propOrder = {
    "requestingPartyReference",
    "creditApprovalRequestType",
    "creditApprovalModel",
    "originalTrade",
    "tradeIdentifier",
    "originalPackage",
    "packageIdentifier"
})
public class OriginalRequestDetails {

    protected PartyReference requestingPartyReference;
    @XmlSchemaType(name = "token")
    protected CreditApprovalRequestTypeEnum creditApprovalRequestType;
    protected CreditApprovalModel creditApprovalModel;
    protected Trade originalTrade;
    protected List<TradeIdentifier> tradeIdentifier;
    protected TradePackage originalPackage;
    protected IssuerTradeId packageIdentifier;

    /**
     * Gets the value of the requestingPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getRequestingPartyReference() {
        return requestingPartyReference;
    }

    /**
     * Sets the value of the requestingPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setRequestingPartyReference(PartyReference value) {
        this.requestingPartyReference = value;
    }

    /**
     * Gets the value of the creditApprovalRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link CreditApprovalRequestTypeEnum }
     *     
     */
    public CreditApprovalRequestTypeEnum getCreditApprovalRequestType() {
        return creditApprovalRequestType;
    }

    /**
     * Sets the value of the creditApprovalRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditApprovalRequestTypeEnum }
     *     
     */
    public void setCreditApprovalRequestType(CreditApprovalRequestTypeEnum value) {
        this.creditApprovalRequestType = value;
    }

    /**
     * Gets the value of the creditApprovalModel property.
     * 
     * @return
     *     possible object is
     *     {@link CreditApprovalModel }
     *     
     */
    public CreditApprovalModel getCreditApprovalModel() {
        return creditApprovalModel;
    }

    /**
     * Sets the value of the creditApprovalModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditApprovalModel }
     *     
     */
    public void setCreditApprovalModel(CreditApprovalModel value) {
        this.creditApprovalModel = value;
    }

    /**
     * Gets the value of the originalTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getOriginalTrade() {
        return originalTrade;
    }

    /**
     * Sets the value of the originalTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setOriginalTrade(Trade value) {
        this.originalTrade = value;
    }

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeIdentifier }
     * 
     * 
     */
    public List<TradeIdentifier> getTradeIdentifier() {
        if (tradeIdentifier == null) {
            tradeIdentifier = new ArrayList<TradeIdentifier>();
        }
        return this.tradeIdentifier;
    }

    /**
     * Gets the value of the originalPackage property.
     * 
     * @return
     *     possible object is
     *     {@link TradePackage }
     *     
     */
    public TradePackage getOriginalPackage() {
        return originalPackage;
    }

    /**
     * Sets the value of the originalPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePackage }
     *     
     */
    public void setOriginalPackage(TradePackage value) {
        this.originalPackage = value;
    }

    /**
     * Gets the value of the packageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerTradeId }
     *     
     */
    public IssuerTradeId getPackageIdentifier() {
        return packageIdentifier;
    }

    /**
     * Sets the value of the packageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerTradeId }
     *     
     */
    public void setPackageIdentifier(IssuerTradeId value) {
        this.packageIdentifier = value;
    }

}
