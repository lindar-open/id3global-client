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
 * <p>Java class for GlobalChina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalChina"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResidentIdentityCard" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalChinaResidentIdentityCard" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalChina", propOrder = {
    "residentIdentityCard"
})
public class GlobalChina {

    @XmlElementRef(name = "ResidentIdentityCard", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalChinaResidentIdentityCard> residentIdentityCard;

    /**
     * Gets the value of the residentIdentityCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalChinaResidentIdentityCard }{@code >}
     *     
     */
    public JAXBElement<GlobalChinaResidentIdentityCard> getResidentIdentityCard() {
        return residentIdentityCard;
    }

    /**
     * Sets the value of the residentIdentityCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalChinaResidentIdentityCard }{@code >}
     *     
     */
    public void setResidentIdentityCard(JAXBElement<GlobalChinaResidentIdentityCard> value) {
        this.residentIdentityCard = value;
    }

}
