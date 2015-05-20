//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.20 at 01:28:29 PM CDT 
//


package com.opengamma.strata.examples.fpml.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="requesterOrderId" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *             &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;/choice>
 *         &lt;element name="submittedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.fpml.org/FpML-5/pretrade}OrderStatusEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="reason" type="{http://www.fpml.org/FpML-5/pretrade}Reason" minOccurs="0"/>
 *             &lt;element name="counterofferQuote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="totalSize" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *             &lt;element name="fills" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *             &lt;element name="filledSize" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *             &lt;element name="remainingSize" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *             &lt;element name="fill" type="{http://www.fpml.org/FpML-5/pretrade}OrderFill" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;choice minOccurs="0">
 *               &lt;element name="trade" type="{http://www.fpml.org/FpML-5/pretrade}Trade"/>
 *               &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/pretrade}TradeIdentifier" maxOccurs="unbounded"/>
 *               &lt;element name="tradePackage" type="{http://www.fpml.org/FpML-5/pretrade}TradePackage"/>
 *             &lt;/choice>
 *             &lt;element name="creditLimitReference" type="{http://www.fpml.org/FpML-5/pretrade}CreditLimitReference" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
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
@XmlType(name = "OrderStatus", propOrder = {
    "content"
})
public class OrderStatus {

    @XmlElementRefs({
        @XmlElementRef(name = "tradeIdentifier", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "orderId", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reason", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "creditLimitReference", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "totalSize", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fills", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "trade", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "counterofferQuote", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tradePackage", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "status", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "submittedTime", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remainingSize", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "filledSize", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "requesterOrderId", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "order", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fill", namespace = "http://www.fpml.org/FpML-5/pretrade", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "OrderId" is used by two different parts of a schema. See: 
     * line 171 of file:/Users/jacbop/Code/Strata/examples/src/main/resources/fpml/v5_7/pretrade/fpml-pretrade-processes-5-7.xsd
     * line 169 of file:/Users/jacbop/Code/Strata/examples/src/main/resources/fpml/v5_7/pretrade/fpml-pretrade-processes-5-7.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TradeIdentifier }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Reason }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditLimitReference }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link Trade }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link TradePackage }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderStatusEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderFill }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
