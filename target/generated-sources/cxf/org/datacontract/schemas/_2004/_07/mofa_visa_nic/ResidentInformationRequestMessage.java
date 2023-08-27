
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ResidentInformationParam;


/**
 * <p>Java class for ResidentInformationRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResidentInformationRequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResidentInformationParam" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}ResidentInformationParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidentInformationRequestMessage", propOrder = {
    "residentInformationParam"
})
public class ResidentInformationRequestMessage {

    @XmlElementRef(name = "ResidentInformationParam", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ResidentInformationParam> residentInformationParam;

    /**
     * Gets the value of the residentInformationParam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResidentInformationParam }{@code >}
     *     
     */
    public JAXBElement<ResidentInformationParam> getResidentInformationParam() {
        return residentInformationParam;
    }

    /**
     * Sets the value of the residentInformationParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResidentInformationParam }{@code >}
     *     
     */
    public void setResidentInformationParam(JAXBElement<ResidentInformationParam> value) {
        this.residentInformationParam = value;
    }

}
