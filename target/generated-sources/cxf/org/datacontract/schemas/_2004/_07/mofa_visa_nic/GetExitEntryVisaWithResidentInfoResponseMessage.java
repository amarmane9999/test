
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ExitEntryVisaData;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ResidentInformationData;


/**
 * <p>Java class for GetExitEntryVisaWithResidentInfoResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetExitEntryVisaWithResidentInfoResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExitEntryVisaData" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}ExitEntryVisaData" minOccurs="0"/&gt;
 *         &lt;element name="ResidentInformationData" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}ResidentInformationData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetExitEntryVisaWithResidentInfoResponseMessage", propOrder = {
    "exitEntryVisaData",
    "residentInformationData"
})
public class GetExitEntryVisaWithResidentInfoResponseMessage {

    @XmlElementRef(name = "ExitEntryVisaData", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ExitEntryVisaData> exitEntryVisaData;
    @XmlElementRef(name = "ResidentInformationData", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ResidentInformationData> residentInformationData;

    /**
     * Gets the value of the exitEntryVisaData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExitEntryVisaData }{@code >}
     *     
     */
    public JAXBElement<ExitEntryVisaData> getExitEntryVisaData() {
        return exitEntryVisaData;
    }

    /**
     * Sets the value of the exitEntryVisaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExitEntryVisaData }{@code >}
     *     
     */
    public void setExitEntryVisaData(JAXBElement<ExitEntryVisaData> value) {
        this.exitEntryVisaData = value;
    }

    /**
     * Gets the value of the residentInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResidentInformationData }{@code >}
     *     
     */
    public JAXBElement<ResidentInformationData> getResidentInformationData() {
        return residentInformationData;
    }

    /**
     * Sets the value of the residentInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResidentInformationData }{@code >}
     *     
     */
    public void setResidentInformationData(JAXBElement<ResidentInformationData> value) {
        this.residentInformationData = value;
    }

}
