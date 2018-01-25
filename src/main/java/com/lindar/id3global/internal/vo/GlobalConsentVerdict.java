//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.17 at 09:47:18 AM BST 
//


package com.lindar.id3global.internal.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalConsentVerdict.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalConsentVerdict"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Approved"/&gt;
 *     &lt;enumeration value="Reject"/&gt;
 *     &lt;enumeration value="RequestInfo"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalConsentVerdict")
@XmlEnum
public enum GlobalConsentVerdict {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Reject")
    REJECT("Reject"),
    @XmlEnumValue("RequestInfo")
    REQUEST_INFO("RequestInfo"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel");
    private final String value;

    GlobalConsentVerdict(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalConsentVerdict fromValue(String v) {
        for (GlobalConsentVerdict c: GlobalConsentVerdict.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}