
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationVisaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationVisaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VisaNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VisaStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisaStatusCode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="VisitorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisitorStatusCode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationVisaData", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", propOrder = {
    "visaNumber",
    "visaStatus",
    "visaStatusCode",
    "visitorStatus",
    "visitorStatusCode"
})
public class OrganizationVisaData {

    @XmlElement(name = "VisaNumber")
    protected Double visaNumber;
    @XmlElementRef(name = "VisaStatus", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visaStatus;
    @XmlElement(name = "VisaStatusCode")
    protected Short visaStatusCode;
    @XmlElementRef(name = "VisitorStatus", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visitorStatus;
    @XmlElement(name = "VisitorStatusCode")
    protected Short visitorStatusCode;

    /**
     * Gets the value of the visaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVisaNumber() {
        return visaNumber;
    }

    /**
     * Sets the value of the visaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVisaNumber(Double value) {
        this.visaNumber = value;
    }

    /**
     * Gets the value of the visaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisaStatus() {
        return visaStatus;
    }

    /**
     * Sets the value of the visaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisaStatus(JAXBElement<String> value) {
        this.visaStatus = value;
    }

    /**
     * Gets the value of the visaStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVisaStatusCode() {
        return visaStatusCode;
    }

    /**
     * Sets the value of the visaStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVisaStatusCode(Short value) {
        this.visaStatusCode = value;
    }

    /**
     * Gets the value of the visitorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisitorStatus() {
        return visitorStatus;
    }

    /**
     * Sets the value of the visitorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisitorStatus(JAXBElement<String> value) {
        this.visitorStatus = value;
    }

    /**
     * Gets the value of the visitorStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVisitorStatusCode() {
        return visitorStatusCode;
    }

    /**
     * Sets the value of the visitorStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVisitorStatusCode(Short value) {
        this.visitorStatusCode = value;
    }

}
