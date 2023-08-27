
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CitizenInformationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CitizenInformationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BirthCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BirthDateG" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BirthDateH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeathStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FamilyNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FamilyNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FatherNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FatherNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GrandfatherNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GrandfatherNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalID" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NationalIDExpiryDateG" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NationalIDExpiryDateH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NationalIDIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OccupationCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SexCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitizenInformationData", propOrder = {
    "birthCity",
    "birthDateG",
    "birthDateH",
    "city",
    "deathStatus",
    "district",
    "familyNameAr",
    "familyNameEn",
    "fatherNameAr",
    "fatherNameEn",
    "firstNameAr",
    "firstNameEn",
    "grandfatherNameAr",
    "grandfatherNameEn",
    "maritalStatus",
    "nationalID",
    "nationalIDExpiryDateG",
    "nationalIDExpiryDateH",
    "nationalIDIssuePlace",
    "occupation",
    "occupationCode",
    "sex",
    "sexCode",
    "streetName",
    "zone"
})
public class CitizenInformationData {

    @XmlElementRef(name = "BirthCity", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> birthCity;
    @XmlElementRef(name = "BirthDateG", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> birthDateG;
    @XmlElementRef(name = "BirthDateH", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> birthDateH;
    @XmlElementRef(name = "City", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "DeathStatus", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deathStatus;
    @XmlElementRef(name = "District", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> district;
    @XmlElementRef(name = "FamilyNameAr", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> familyNameAr;
    @XmlElementRef(name = "FamilyNameEn", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> familyNameEn;
    @XmlElementRef(name = "FatherNameAr", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fatherNameAr;
    @XmlElementRef(name = "FatherNameEn", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fatherNameEn;
    @XmlElementRef(name = "FirstNameAr", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstNameAr;
    @XmlElementRef(name = "FirstNameEn", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstNameEn;
    @XmlElementRef(name = "GrandfatherNameAr", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grandfatherNameAr;
    @XmlElementRef(name = "GrandfatherNameEn", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grandfatherNameEn;
    @XmlElementRef(name = "MaritalStatus", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maritalStatus;
    @XmlElement(name = "NationalID")
    protected Double nationalID;
    @XmlElementRef(name = "NationalIDExpiryDateG", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> nationalIDExpiryDateG;
    @XmlElementRef(name = "NationalIDExpiryDateH", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationalIDExpiryDateH;
    @XmlElementRef(name = "NationalIDIssuePlace", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationalIDIssuePlace;
    @XmlElementRef(name = "Occupation", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> occupation;
    @XmlElement(name = "OccupationCode")
    protected Integer occupationCode;
    @XmlElementRef(name = "Sex", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sex;
    @XmlElement(name = "SexCode")
    protected Integer sexCode;
    @XmlElementRef(name = "StreetName", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetName;
    @XmlElementRef(name = "Zone", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zone;

    /**
     * Gets the value of the birthCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBirthCity() {
        return birthCity;
    }

    /**
     * Sets the value of the birthCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBirthCity(JAXBElement<String> value) {
        this.birthCity = value;
    }

    /**
     * Gets the value of the birthDateG property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBirthDateG() {
        return birthDateG;
    }

    /**
     * Sets the value of the birthDateG property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBirthDateG(JAXBElement<XMLGregorianCalendar> value) {
        this.birthDateG = value;
    }

    /**
     * Gets the value of the birthDateH property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBirthDateH() {
        return birthDateH;
    }

    /**
     * Sets the value of the birthDateH property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBirthDateH(JAXBElement<String> value) {
        this.birthDateH = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the deathStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeathStatus() {
        return deathStatus;
    }

    /**
     * Sets the value of the deathStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeathStatus(JAXBElement<String> value) {
        this.deathStatus = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistrict(JAXBElement<String> value) {
        this.district = value;
    }

    /**
     * Gets the value of the familyNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFamilyNameAr() {
        return familyNameAr;
    }

    /**
     * Sets the value of the familyNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFamilyNameAr(JAXBElement<String> value) {
        this.familyNameAr = value;
    }

    /**
     * Gets the value of the familyNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFamilyNameEn() {
        return familyNameEn;
    }

    /**
     * Sets the value of the familyNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFamilyNameEn(JAXBElement<String> value) {
        this.familyNameEn = value;
    }

    /**
     * Gets the value of the fatherNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFatherNameAr() {
        return fatherNameAr;
    }

    /**
     * Sets the value of the fatherNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFatherNameAr(JAXBElement<String> value) {
        this.fatherNameAr = value;
    }

    /**
     * Gets the value of the fatherNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFatherNameEn() {
        return fatherNameEn;
    }

    /**
     * Sets the value of the fatherNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFatherNameEn(JAXBElement<String> value) {
        this.fatherNameEn = value;
    }

    /**
     * Gets the value of the firstNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstNameAr() {
        return firstNameAr;
    }

    /**
     * Sets the value of the firstNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstNameAr(JAXBElement<String> value) {
        this.firstNameAr = value;
    }

    /**
     * Gets the value of the firstNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstNameEn() {
        return firstNameEn;
    }

    /**
     * Sets the value of the firstNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstNameEn(JAXBElement<String> value) {
        this.firstNameEn = value;
    }

    /**
     * Gets the value of the grandfatherNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrandfatherNameAr() {
        return grandfatherNameAr;
    }

    /**
     * Sets the value of the grandfatherNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrandfatherNameAr(JAXBElement<String> value) {
        this.grandfatherNameAr = value;
    }

    /**
     * Gets the value of the grandfatherNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrandfatherNameEn() {
        return grandfatherNameEn;
    }

    /**
     * Sets the value of the grandfatherNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrandfatherNameEn(JAXBElement<String> value) {
        this.grandfatherNameEn = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<String> value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the nationalID property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNationalID() {
        return nationalID;
    }

    /**
     * Sets the value of the nationalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNationalID(Double value) {
        this.nationalID = value;
    }

    /**
     * Gets the value of the nationalIDExpiryDateG property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNationalIDExpiryDateG() {
        return nationalIDExpiryDateG;
    }

    /**
     * Sets the value of the nationalIDExpiryDateG property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNationalIDExpiryDateG(JAXBElement<XMLGregorianCalendar> value) {
        this.nationalIDExpiryDateG = value;
    }

    /**
     * Gets the value of the nationalIDExpiryDateH property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationalIDExpiryDateH() {
        return nationalIDExpiryDateH;
    }

    /**
     * Sets the value of the nationalIDExpiryDateH property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationalIDExpiryDateH(JAXBElement<String> value) {
        this.nationalIDExpiryDateH = value;
    }

    /**
     * Gets the value of the nationalIDIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationalIDIssuePlace() {
        return nationalIDIssuePlace;
    }

    /**
     * Sets the value of the nationalIDIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationalIDIssuePlace(JAXBElement<String> value) {
        this.nationalIDIssuePlace = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOccupation(JAXBElement<String> value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the occupationCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOccupationCode() {
        return occupationCode;
    }

    /**
     * Sets the value of the occupationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOccupationCode(Integer value) {
        this.occupationCode = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSex(JAXBElement<String> value) {
        this.sex = value;
    }

    /**
     * Gets the value of the sexCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSexCode() {
        return sexCode;
    }

    /**
     * Sets the value of the sexCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSexCode(Integer value) {
        this.sexCode = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreetName(JAXBElement<String> value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZone(JAXBElement<String> value) {
        this.zone = value;
    }

}
