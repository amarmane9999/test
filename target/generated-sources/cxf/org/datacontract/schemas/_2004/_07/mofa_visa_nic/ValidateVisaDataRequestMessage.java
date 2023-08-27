
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.VisaDataX0020;


/**
 * <p>Java class for ValidateVisaDataRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateVisaDataRequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidateVisaData" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}VisaData_x0020_" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateVisaDataRequestMessage", propOrder = {
    "validateVisaData"
})
public class ValidateVisaDataRequestMessage {

    @XmlElementRef(name = "ValidateVisaData", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<VisaDataX0020> validateVisaData;

    /**
     * Gets the value of the validateVisaData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VisaDataX0020 }{@code >}
     *     
     */
    public JAXBElement<VisaDataX0020> getValidateVisaData() {
        return validateVisaData;
    }

    /**
     * Sets the value of the validateVisaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VisaDataX0020 }{@code >}
     *     
     */
    public void setValidateVisaData(JAXBElement<VisaDataX0020> value) {
        this.validateVisaData = value;
    }

}
