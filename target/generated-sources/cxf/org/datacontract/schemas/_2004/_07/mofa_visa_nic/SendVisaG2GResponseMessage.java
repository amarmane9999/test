
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ArrayOfVisaStatusX0020;


/**
 * <p>Java class for SendVisaG2gResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendVisaG2gResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListVisaStatus" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}ArrayOfVisaStatus_x0020_" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendVisaG2gResponseMessage", propOrder = {
    "listVisaStatus"
})
public class SendVisaG2GResponseMessage {

    @XmlElementRef(name = "ListVisaStatus", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVisaStatusX0020> listVisaStatus;

    /**
     * Gets the value of the listVisaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVisaStatusX0020 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVisaStatusX0020> getListVisaStatus() {
        return listVisaStatus;
    }

    /**
     * Sets the value of the listVisaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVisaStatusX0020 }{@code >}
     *     
     */
    public void setListVisaStatus(JAXBElement<ArrayOfVisaStatusX0020> value) {
        this.listVisaStatus = value;
    }

}
