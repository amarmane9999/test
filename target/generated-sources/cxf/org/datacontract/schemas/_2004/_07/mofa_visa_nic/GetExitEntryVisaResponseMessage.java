
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ExitEntryVisaData;


/**
 * <p>Java class for GetExitEntryVisaResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetExitEntryVisaResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExitEntryVisaData" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}ExitEntryVisaData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetExitEntryVisaResponseMessage", propOrder = {
    "exitEntryVisaData"
})
public class GetExitEntryVisaResponseMessage {

    @XmlElementRef(name = "ExitEntryVisaData", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ExitEntryVisaData> exitEntryVisaData;

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

}
