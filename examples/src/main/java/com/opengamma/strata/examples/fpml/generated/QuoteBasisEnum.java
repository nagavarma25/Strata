//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.20 at 01:28:29 PM CDT 
//


package com.opengamma.strata.examples.fpml.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteBasisEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuoteBasisEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Currency1PerCurrency2"/>
 *     &lt;enumeration value="Currency2PerCurrency1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuoteBasisEnum")
@XmlEnum
public enum QuoteBasisEnum {


    /**
     * The amount of currency1 for one unit of currency2
     * 
     */
    @XmlEnumValue("Currency1PerCurrency2")
    CURRENCY_1_PER_CURRENCY_2("Currency1PerCurrency2"),

    /**
     * The amount of currency2 for one unit of currency1
     * 
     */
    @XmlEnumValue("Currency2PerCurrency1")
    CURRENCY_2_PER_CURRENCY_1("Currency2PerCurrency1");
    private final String value;

    QuoteBasisEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuoteBasisEnum fromValue(String v) {
        for (QuoteBasisEnum c: QuoteBasisEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
