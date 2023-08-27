
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CitizenInformationParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CitizenInformationParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BirthDateH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalID" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitizenInformationParam", propOrder = {
    "birthDateH",
    "nationalID"
})
public class CitizenInformationParam {

    @XmlElementRef(name = "BirthDateH", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> birthDateH;
    @XmlElement(name = "NationalID")
    protected Double nationalID;

    /**
     * Gets the value of the birthDateH property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBirthDateH() {
        return birthDateH;
    }

    /**
     * Sets the value of the birthDateH property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBirthDateH(JAXBElement<String> value) {
        this.birthDateH = value;
    }

    /**
     * Gets the value of the nationalID property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNationalID() {
        return nationalID;
    }

    /**
     * Sets the value of the nationalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNationalID(Double value) {
        this.nationalID = value;
    }

}
