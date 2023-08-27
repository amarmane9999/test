
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExitEntryVisaParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExitEntryVisaParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeNationalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IqamaNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SponsorID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExitEntryVisaParam", propOrder = {
    "birthDate",
    "employeeNationalId",
    "iqamaNo",
    "sponsorID"
})
public class ExitEntryVisaParam {

    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "EmployeeNationalId")
    protected Long employeeNationalId;
    @XmlElement(name = "IqamaNo")
    protected Long iqamaNo;
    @XmlElement(name = "SponsorID")
    protected Long sponsorID;

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the employeeNationalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmployeeNationalId() {
        return employeeNationalId;
    }

    /**
     * Sets the value of the employeeNationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmployeeNationalId(Long value) {
        this.employeeNationalId = value;
    }

    /**
     * Gets the value of the iqamaNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIqamaNo() {
        return iqamaNo;
    }

    /**
     * Sets the value of the iqamaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIqamaNo(Long value) {
        this.iqamaNo = value;
    }

    /**
     * Gets the value of the sponsorID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSponsorID() {
        return sponsorID;
    }

    /**
     * Sets the value of the sponsorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSponsorID(Long value) {
        this.sponsorID = value;
    }

}
