
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.CitizenInformationParam;


/**
 * <p>Java class for CitizenInformationRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CitizenInformationRequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CitizenInformationParam" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}CitizenInformationParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitizenInformationRequestMessage", propOrder = {
    "citizenInformationParam"
})
public class CitizenInformationRequestMessage {

    @XmlElementRef(name = "CitizenInformationParam", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<CitizenInformationParam> citizenInformationParam;

    /**
     * Gets the value of the citizenInformationParam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CitizenInformationParam }{@code >}
     *     
     */
    public JAXBElement<CitizenInformationParam> getCitizenInformationParam() {
        return citizenInformationParam;
    }

    /**
     * Sets the value of the citizenInformationParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CitizenInformationParam }{@code >}
     *     
     */
    public void setCitizenInformationParam(JAXBElement<CitizenInformationParam> value) {
        this.citizenInformationParam = value;
    }

}
