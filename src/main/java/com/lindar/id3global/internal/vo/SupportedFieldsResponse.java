//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.17 at 09:47:18 AM BST 
//


package com.lindar.id3global.internal.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupportedFieldsResult" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalSupportedFields" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supportedFieldsResult"
})
@XmlRootElement(name = "SupportedFieldsResponse")
public class SupportedFieldsResponse {

    @XmlElementRef(name = "SupportedFieldsResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalSupportedFields> supportedFieldsResult;

    /**
     * Gets the value of the supportedFieldsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalSupportedFields }{@code >}
     *     
     */
    public JAXBElement<GlobalSupportedFields> getSupportedFieldsResult() {
        return supportedFieldsResult;
    }

    /**
     * Sets the value of the supportedFieldsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalSupportedFields }{@code >}
     *     
     */
    public void setSupportedFieldsResult(JAXBElement<GlobalSupportedFields> value) {
        this.supportedFieldsResult = value;
    }

}
