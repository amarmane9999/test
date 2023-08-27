
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetWorkVisaDataResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWorkVisaDataResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NoOfPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WorkVisaDataList" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService}ArrayOfWorkVisaData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWorkVisaDataResponseMessage", propOrder = {
    "noOfPages",
    "workVisaDataList"
})
public class GetWorkVisaDataResponseMessage {

    @XmlElement(name = "NoOfPages")
    protected Integer noOfPages;
    @XmlElementRef(name = "WorkVisaDataList", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorkVisaData> workVisaDataList;

    /**
     * Gets the value of the noOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfPages() {
        return noOfPages;
    }

    /**
     * Sets the value of the noOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfPages(Integer value) {
        this.noOfPages = value;
    }

    /**
     * Gets the value of the workVisaDataList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorkVisaData> getWorkVisaDataList() {
        return workVisaDataList;
    }

    /**
     * Sets the value of the workVisaDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaData }{@code >}
     *     
     */
    public void setWorkVisaDataList(JAXBElement<ArrayOfWorkVisaData> value) {
        this.workVisaDataList = value;
    }

}
