
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WorkVisaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkVisaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SponsorAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SponsorFileNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SponsorID" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SponsorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisaIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="VisaNo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VisaType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="WorkVisaDetailList" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService}ArrayOfWorkVisaDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkVisaData", propOrder = {
    "sponsorAddress",
    "sponsorFileNo",
    "sponsorID",
    "sponsorName",
    "visaIssueDate",
    "visaNo",
    "visaType",
    "workVisaDetailList"
})
public class WorkVisaData {

    @XmlElementRef(name = "SponsorAddress", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sponsorAddress;
    @XmlElement(name = "SponsorFileNo")
    protected Integer sponsorFileNo;
    @XmlElement(name = "SponsorID")
    protected Double sponsorID;
    @XmlElementRef(name = "SponsorName", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sponsorName;
    @XmlElement(name = "VisaIssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar visaIssueDate;
    @XmlElement(name = "VisaNo")
    protected Double visaNo;
    @XmlElement(name = "VisaType")
    protected Short visaType;
    @XmlElementRef(name = "WorkVisaDetailList", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorkVisaDetail> workVisaDetailList;

    /**
     * Gets the value of the sponsorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSponsorAddress() {
        return sponsorAddress;
    }

    /**
     * Sets the value of the sponsorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSponsorAddress(JAXBElement<String> value) {
        this.sponsorAddress = value;
    }

    /**
     * Gets the value of the sponsorFileNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSponsorFileNo() {
        return sponsorFileNo;
    }

    /**
     * Sets the value of the sponsorFileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSponsorFileNo(Integer value) {
        this.sponsorFileNo = value;
    }

    /**
     * Gets the value of the sponsorID property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSponsorID() {
        return sponsorID;
    }

    /**
     * Sets the value of the sponsorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSponsorID(Double value) {
        this.sponsorID = value;
    }

    /**
     * Gets the value of the sponsorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSponsorName() {
        return sponsorName;
    }

    /**
     * Sets the value of the sponsorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSponsorName(JAXBElement<String> value) {
        this.sponsorName = value;
    }

    /**
     * Gets the value of the visaIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVisaIssueDate() {
        return visaIssueDate;
    }

    /**
     * Sets the value of the visaIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVisaIssueDate(XMLGregorianCalendar value) {
        this.visaIssueDate = value;
    }

    /**
     * Gets the value of the visaNo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVisaNo() {
        return visaNo;
    }

    /**
     * Sets the value of the visaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVisaNo(Double value) {
        this.visaNo = value;
    }

    /**
     * Gets the value of the visaType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVisaType() {
        return visaType;
    }

    /**
     * Sets the value of the visaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVisaType(Short value) {
        this.visaType = value;
    }

    /**
     * Gets the value of the workVisaDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorkVisaDetail> getWorkVisaDetailList() {
        return workVisaDetailList;
    }

    /**
     * Sets the value of the workVisaDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkVisaDetail }{@code >}
     *     
     */
    public void setWorkVisaDetailList(JAXBElement<ArrayOfWorkVisaDetail> value) {
        this.workVisaDetailList = value;
    }

}
