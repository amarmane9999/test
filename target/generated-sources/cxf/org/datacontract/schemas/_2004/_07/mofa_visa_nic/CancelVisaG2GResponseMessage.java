
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ArrayOfCancelVisaStatus;


/**
 * <p>Java class for CancelVisaG2gResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelVisaG2gResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelVisaStatusList" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}ArrayOfCancelVisaStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelVisaG2gResponseMessage", propOrder = {
    "cancelVisaStatusList"
})
public class CancelVisaG2GResponseMessage {

    @XmlElementRef(name = "CancelVisaStatusList", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCancelVisaStatus> cancelVisaStatusList;

    /**
     * Gets the value of the cancelVisaStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCancelVisaStatus }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCancelVisaStatus> getCancelVisaStatusList() {
        return cancelVisaStatusList;
    }

    /**
     * Sets the value of the cancelVisaStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCancelVisaStatus }{@code >}
     *     
     */
    public void setCancelVisaStatusList(JAXBElement<ArrayOfCancelVisaStatus> value) {
        this.cancelVisaStatusList = value;
    }

}
