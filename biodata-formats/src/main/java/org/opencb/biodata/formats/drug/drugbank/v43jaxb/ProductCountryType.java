//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.25 at 11:40:12 AM BST 
//


package org.opencb.biodata.formats.drug.drugbank.v43jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product-country-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="product-country-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="Canada"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "product-country-type")
@XmlEnum
public enum ProductCountryType {

    US("US"),
    @XmlEnumValue("Canada")
    CANADA("Canada");
    private final String value;

    ProductCountryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductCountryType fromValue(String v) {
        for (ProductCountryType c: ProductCountryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
