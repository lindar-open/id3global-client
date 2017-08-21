//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.17 at 09:47:18 AM BST 
//


package com.lindar.id3global.internal.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalUnitedStatesAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalUnitedStatesAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.id3global.com/ID3gWS/2013/04}GlobalSupplierAccount"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubMerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalUnitedStatesAccount", propOrder = {
    "merchantID",
    "subMerchantID"
})
public class GlobalUnitedStatesAccount
    extends GlobalSupplierAccount
{

    @XmlElementRef(name = "MerchantID", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantID;
    @XmlElementRef(name = "SubMerchantID", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subMerchantID;

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantID(JAXBElement<String> value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the subMerchantID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubMerchantID() {
        return subMerchantID;
    }

    /**
     * Sets the value of the subMerchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubMerchantID(JAXBElement<String> value) {
        this.subMerchantID = value;
    }

}
