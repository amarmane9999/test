
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOrganizationVisaInfoResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrganizationVisaInfoResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOrganizationVisaData" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema}ArrayOfOrganizationVisaData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrganizationVisaInfoResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", propOrder = {
    "listOrganizationVisaData"
})
public class GetOrganizationVisaInfoResponseMessage {

    @XmlElementRef(name = "ListOrganizationVisaData", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrganizationVisaData> listOrganizationVisaData;

    /**
     * Gets the value of the listOrganizationVisaData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrganizationVisaData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrganizationVisaData> getListOrganizationVisaData() {
        return listOrganizationVisaData;
    }

    /**
     * Sets the value of the listOrganizationVisaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrganizationVisaData }{@code >}
     *     
     */
    public void setListOrganizationVisaData(JAXBElement<ArrayOfOrganizationVisaData> value) {
        this.listOrganizationVisaData = value;
    }

}
