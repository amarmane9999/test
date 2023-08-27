
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaCompanion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaCompanion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanionDoB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanionSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisaNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaCompanion", propOrder = {
    "companionDoB",
    "companionName",
    "companionSex",
    "relation",
    "visaNo"
})
public class VisaCompanion {

    @XmlElementRef(name = "CompanionDoB", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companionDoB;
    @XmlElementRef(name = "CompanionName", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companionName;
    @XmlElementRef(name = "CompanionSex", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companionSex;
    @XmlElementRef(name = "Relation", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relation;
    @XmlElement(name = "VisaNo")
    protected Long visaNo;

    /**
     * Gets the value of the companionDoB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanionDoB() {
        return companionDoB;
    }

    /**
     * Sets the value of the companionDoB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanionDoB(JAXBElement<String> value) {
        this.companionDoB = value;
    }

    /**
     * Gets the value of the companionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanionName() {
        return companionName;
    }

    /**
     * Sets the value of the companionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanionName(JAXBElement<String> value) {
        this.companionName = value;
    }

    /**
     * Gets the value of the companionSex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanionSex() {
        return companionSex;
    }

    /**
     * Sets the value of the companionSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanionSex(JAXBElement<String> value) {
        this.companionSex = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelation(JAXBElement<String> value) {
        this.relation = value;
    }

    /**
     * Gets the value of the visaNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaNo() {
        return visaNo;
    }

    /**
     * Sets the value of the visaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaNo(Long value) {
        this.visaNo = value;
    }

}
