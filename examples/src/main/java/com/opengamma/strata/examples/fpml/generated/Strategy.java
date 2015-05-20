//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.20 at 01:28:29 PM CDT 
//


package com.opengamma.strata.examples.fpml.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a group of products making up a single trade.
 * 
 * <p>Java class for Strategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Strategy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/pretrade}Product">
 *       &lt;sequence>
 *         &lt;element name="strategyComponentIdentifier" type="{http://www.fpml.org/FpML-5/pretrade}StrategyComponentIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="premiumProductReference" type="{http://www.fpml.org/FpML-5/pretrade}ProductReference" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/pretrade}product" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Strategy", propOrder = {
    "strategyComponentIdentifier",
    "premiumProductReference",
    "product"
})
public class Strategy
    extends Product
{

    protected List<StrategyComponentIdentification> strategyComponentIdentifier;
    protected ProductReference premiumProductReference;
    @XmlElementRef(name = "product", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends Product>> product;

    /**
     * Gets the value of the strategyComponentIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategyComponentIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategyComponentIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyComponentIdentification }
     * 
     * 
     */
    public List<StrategyComponentIdentification> getStrategyComponentIdentifier() {
        if (strategyComponentIdentifier == null) {
            strategyComponentIdentifier = new ArrayList<StrategyComponentIdentification>();
        }
        return this.strategyComponentIdentifier;
    }

    /**
     * Gets the value of the premiumProductReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProductReference }
     *     
     */
    public ProductReference getPremiumProductReference() {
        return premiumProductReference;
    }

    /**
     * Sets the value of the premiumProductReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductReference }
     *     
     */
    public void setPremiumProductReference(ProductReference value) {
        this.premiumProductReference = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Swap }{@code >}
     * {@link JAXBElement }{@code <}{@link Strategy }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditDefaultSwap }{@code >}
     * {@link JAXBElement }{@code <}{@link Product }{@code >}
     * {@link JAXBElement }{@code <}{@link FxSingleLeg }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Product>> getProduct() {
        if (product == null) {
            product = new ArrayList<JAXBElement<? extends Product>>();
        }
        return this.product;
    }

}
