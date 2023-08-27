
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.CitizenInformationData;


/**
 * <p>Java class for CitizenInformationResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CitizenInformationResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CitizenInformationData" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}CitizenInformationData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitizenInformationResponseMessage", propOrder = {
    "citizenInformationData"
})
public class CitizenInformationResponseMessage {

    @XmlElementRef(name = "CitizenInformationData", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<CitizenInformationData> citizenInformationData;

    /**
     * Gets the value of the citizenInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CitizenInformationData }{@code >}
     *     
     */
    public JAXBElement<CitizenInformationData> getCitizenInformationData() {
        return citizenInformationData;
    }

    /**
     * Sets the value of the citizenInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CitizenInformationData }{@code >}
     *     
     */
    public void setCitizenInformationData(JAXBElement<CitizenInformationData> value) {
        this.citizenInformationData = value;
    }

}
