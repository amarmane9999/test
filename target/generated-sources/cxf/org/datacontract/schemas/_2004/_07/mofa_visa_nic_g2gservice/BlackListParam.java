
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BlackListParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlackListParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeNationalId" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Family_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="First_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gregorian_Birth_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Nationality_Code" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Passport_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlackListParam", propOrder = {
    "employeeNationalId",
    "familyName",
    "firstName",
    "gregorianBirthDate",
    "nationalityCode",
    "passportNumber"
})
public class BlackListParam {

    @XmlElement(name = "EmployeeNationalId")
    protected Double employeeNationalId;
    @XmlElementRef(name = "Family_Name", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> familyName;
    @XmlElementRef(name = "First_Name", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElement(name = "Gregorian_Birth_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gregorianBirthDate;
    @XmlElement(name = "Nationality_Code")
    protected Short nationalityCode;
    @XmlElementRef(name = "Passport_Number", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportNumber;

    /**
     * Gets the value of the employeeNationalId property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEmployeeNationalId() {
        return employeeNationalId;
    }

    /**
     * Sets the value of the employeeNationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEmployeeNationalId(Double value) {
        this.employeeNationalId = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFamilyName(JAXBElement<String> value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the gregorianBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGregorianBirthDate() {
        return gregorianBirthDate;
    }

    /**
     * Sets the value of the gregorianBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGregorianBirthDate(XMLGregorianCalendar value) {
        this.gregorianBirthDate = value;
    }

    /**
     * Gets the value of the nationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Sets the value of the nationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNationalityCode(Short value) {
        this.nationalityCode = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportNumber(JAXBElement<String> value) {
        this.passportNumber = value;
    }

}
