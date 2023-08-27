
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidentInformationParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResidentInformationParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IqamaExpiryDateH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IqamaNO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidentInformationParam", propOrder = {
    "iqamaExpiryDateH",
    "iqamaNO"
})
public class ResidentInformationParam {

    @XmlElementRef(name = "IqamaExpiryDateH", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iqamaExpiryDateH;
    @XmlElement(name = "IqamaNO")
    protected Double iqamaNO;

    /**
     * Gets the value of the iqamaExpiryDateH property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIqamaExpiryDateH() {
        return iqamaExpiryDateH;
    }

    /**
     * Sets the value of the iqamaExpiryDateH property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIqamaExpiryDateH(JAXBElement<String> value) {
        this.iqamaExpiryDateH = value;
    }

    /**
     * Gets the value of the iqamaNO property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIqamaNO() {
        return iqamaNO;
    }

    /**
     * Sets the value of the iqamaNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIqamaNO(Double value) {
        this.iqamaNO = value;
    }

}
