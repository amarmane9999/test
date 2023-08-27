
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ArrayOfVisaDataX0020;


/**
 * <p>Java class for SendVisaG2gRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendVisaG2gRequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListVisaData" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}ArrayOfVisaData_x0020_" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendVisaG2gRequestMessage", propOrder = {
    "listVisaData"
})
public class SendVisaG2GRequestMessage {

    @XmlElementRef(name = "ListVisaData", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVisaDataX0020> listVisaData;

    /**
     * Gets the value of the listVisaData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVisaDataX0020 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVisaDataX0020> getListVisaData() {
        return listVisaData;
    }

    /**
     * Sets the value of the listVisaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVisaDataX0020 }{@code >}
     *     
     */
    public void setListVisaData(JAXBElement<ArrayOfVisaDataX0020> value) {
        this.listVisaData = value;
    }

}
