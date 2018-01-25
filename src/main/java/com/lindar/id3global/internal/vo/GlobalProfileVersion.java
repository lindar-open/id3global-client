//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.17 at 09:47:18 AM BST 
//


package com.lindar.id3global.internal.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GlobalProfileVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalProfileVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.id3global.com/ID3gWS/2013/04}GlobalProfile"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalProfileState" minOccurs="0"/&gt;
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AddressFormat" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAddressFormat" minOccurs="0"/&gt;
 *         &lt;element name="ReAuthenticationLifetime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="AddressLookupEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SessionBlocking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DisableInputStorage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VersionCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="VersionUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="VersionUpdatedBy" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="DocumentImageValidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DocumentImageStorage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VersionUpdatedByAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalProfileVersion", propOrder = {
    "version",
    "revision",
    "state",
    "start",
    "end",
    "addressFormat",
    "reAuthenticationLifetime",
    "addressLookupEnabled",
    "sessionBlocking",
    "disableInputStorage",
    "revisionNote",
    "country",
    "versionCreated",
    "versionUpdated",
    "versionUpdatedBy",
    "documentImageValidation",
    "documentImageStorage",
    "versionUpdatedByAccount"
})
@XmlSeeAlso({
    GlobalProfileDetails.class
})
public class GlobalProfileVersion
    extends GlobalProfile
{

    @XmlElement(name = "Version")
    @XmlSchemaType(name = "unsignedInt")
    protected Long version;
    @XmlElement(name = "Revision")
    @XmlSchemaType(name = "unsignedInt")
    protected Long revision;
    @XmlElement(name = "State")
    @XmlSchemaType(name = "string")
    protected GlobalProfileState state;
    @XmlElementRef(name = "Start", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> start;
    @XmlElementRef(name = "End", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> end;
    @XmlElement(name = "AddressFormat")
    @XmlSchemaType(name = "string")
    protected GlobalAddressFormat addressFormat;
    @XmlElementRef(name = "ReAuthenticationLifetime", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> reAuthenticationLifetime;
    @XmlElement(name = "AddressLookupEnabled")
    protected Boolean addressLookupEnabled;
    @XmlElement(name = "SessionBlocking")
    protected Boolean sessionBlocking;
    @XmlElement(name = "DisableInputStorage")
    protected Boolean disableInputStorage;
    @XmlElementRef(name = "RevisionNote", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> revisionNote;
    @XmlElementRef(name = "Country", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElement(name = "VersionCreated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionCreated;
    @XmlElement(name = "VersionUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionUpdated;
    @XmlElement(name = "VersionUpdatedBy")
    protected String versionUpdatedBy;
    @XmlElement(name = "DocumentImageValidation")
    protected Boolean documentImageValidation;
    @XmlElement(name = "DocumentImageStorage")
    protected Boolean documentImageStorage;
    @XmlElementRef(name = "VersionUpdatedByAccount", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> versionUpdatedByAccount;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevision(Long value) {
        this.revision = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalProfileState }
     *     
     */
    public GlobalProfileState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalProfileState }
     *     
     */
    public void setState(GlobalProfileState value) {
        this.state = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStart(JAXBElement<XMLGregorianCalendar> value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEnd(JAXBElement<XMLGregorianCalendar> value) {
        this.end = value;
    }

    /**
     * Gets the value of the addressFormat property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalAddressFormat }
     *     
     */
    public GlobalAddressFormat getAddressFormat() {
        return addressFormat;
    }

    /**
     * Sets the value of the addressFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalAddressFormat }
     *     
     */
    public void setAddressFormat(GlobalAddressFormat value) {
        this.addressFormat = value;
    }

    /**
     * Gets the value of the reAuthenticationLifetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getReAuthenticationLifetime() {
        return reAuthenticationLifetime;
    }

    /**
     * Sets the value of the reAuthenticationLifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setReAuthenticationLifetime(JAXBElement<Long> value) {
        this.reAuthenticationLifetime = value;
    }

    /**
     * Gets the value of the addressLookupEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressLookupEnabled() {
        return addressLookupEnabled;
    }

    /**
     * Sets the value of the addressLookupEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressLookupEnabled(Boolean value) {
        this.addressLookupEnabled = value;
    }

    /**
     * Gets the value of the sessionBlocking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSessionBlocking() {
        return sessionBlocking;
    }

    /**
     * Sets the value of the sessionBlocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSessionBlocking(Boolean value) {
        this.sessionBlocking = value;
    }

    /**
     * Gets the value of the disableInputStorage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableInputStorage() {
        return disableInputStorage;
    }

    /**
     * Sets the value of the disableInputStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableInputStorage(Boolean value) {
        this.disableInputStorage = value;
    }

    /**
     * Gets the value of the revisionNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevisionNote() {
        return revisionNote;
    }

    /**
     * Sets the value of the revisionNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevisionNote(JAXBElement<String> value) {
        this.revisionNote = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the versionCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionCreated() {
        return versionCreated;
    }

    /**
     * Sets the value of the versionCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionCreated(XMLGregorianCalendar value) {
        this.versionCreated = value;
    }

    /**
     * Gets the value of the versionUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionUpdated() {
        return versionUpdated;
    }

    /**
     * Sets the value of the versionUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionUpdated(XMLGregorianCalendar value) {
        this.versionUpdated = value;
    }

    /**
     * Gets the value of the versionUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionUpdatedBy() {
        return versionUpdatedBy;
    }

    /**
     * Sets the value of the versionUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionUpdatedBy(String value) {
        this.versionUpdatedBy = value;
    }

    /**
     * Gets the value of the documentImageValidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentImageValidation() {
        return documentImageValidation;
    }

    /**
     * Sets the value of the documentImageValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentImageValidation(Boolean value) {
        this.documentImageValidation = value;
    }

    /**
     * Gets the value of the documentImageStorage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentImageStorage() {
        return documentImageStorage;
    }

    /**
     * Sets the value of the documentImageStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentImageStorage(Boolean value) {
        this.documentImageStorage = value;
    }

    /**
     * Gets the value of the versionUpdatedByAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersionUpdatedByAccount() {
        return versionUpdatedByAccount;
    }

    /**
     * Sets the value of the versionUpdatedByAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersionUpdatedByAccount(JAXBElement<String> value) {
        this.versionUpdatedByAccount = value;
    }

}