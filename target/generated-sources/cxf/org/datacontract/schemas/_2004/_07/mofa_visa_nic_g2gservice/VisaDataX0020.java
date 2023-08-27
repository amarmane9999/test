
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
 * <p>Java class for VisaData_x0020_ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaData_x0020_"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankOrderNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BioStatusFlag" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BiometricRefNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BorderNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EmbVisaIssueDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EmbassyCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FamilyNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FamilyNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FatherNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FatherNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="GrandFatherNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GrandFatherNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntendedForOmrah" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobOrRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfEntries" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PassportExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PassportIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PassportIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassportType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PrevNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Religion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RequireHealthInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SponsorAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SponsorID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UmrahProviderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UmrahProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidityDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPassingTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisaCompanion" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}VisaCompanion" minOccurs="0"/&gt;
 *         &lt;element name="VisaJobCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="VisaNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="VisaPermitNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="VisaType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaData_x0020_", propOrder = {
    "bankOrderNo",
    "bioStatusFlag",
    "biometricRefNo",
    "birthDate",
    "birthPlace",
    "borderNo",
    "embVisaIssueDate",
    "embassyCode",
    "familyNameAr",
    "familyNameEn",
    "fatherNameAr",
    "fatherNameEn",
    "firstNameAr",
    "firstNameEn",
    "gender",
    "grandFatherNameAr",
    "grandFatherNameEn",
    "intendedForOmrah",
    "jobOrRelation",
    "nationality",
    "numberOfEntries",
    "passportExpiryDate",
    "passportIssueDate",
    "passportIssuePlace",
    "passportNo",
    "passportType",
    "prevNationality",
    "religion",
    "requireHealthInsurance",
    "residenceDuration",
    "sponsorAddress",
    "sponsorID",
    "umrahProviderID",
    "umrahProviderName",
    "validityDuration",
    "validityPassingTo",
    "visaCompanion",
    "visaJobCode",
    "visaNo",
    "visaPermitNo",
    "visaType"
})
public class VisaDataX0020 {

    @XmlElement(name = "BankOrderNo")
    protected Long bankOrderNo;
    @XmlElement(name = "BioStatusFlag")
    protected Long bioStatusFlag;
    @XmlElement(name = "BiometricRefNo")
    protected Long biometricRefNo;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElementRef(name = "BirthPlace", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> birthPlace;
    @XmlElement(name = "BorderNo")
    protected Long borderNo;
    @XmlElement(name = "EmbVisaIssueDate")
    protected Long embVisaIssueDate;
    @XmlElement(name = "EmbassyCode")
    protected Long embassyCode;
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
    @XmlElement(name = "Gender")
    protected Long gender;
    @XmlElementRef(name = "GrandFatherNameAr", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grandFatherNameAr;
    @XmlElementRef(name = "GrandFatherNameEn", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grandFatherNameEn;
    @XmlElementRef(name = "IntendedForOmrah", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intendedForOmrah;
    @XmlElementRef(name = "JobOrRelation", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobOrRelation;
    @XmlElementRef(name = "Nationality", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationality;
    @XmlElement(name = "NumberOfEntries")
    protected Long numberOfEntries;
    @XmlElement(name = "PassportExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passportExpiryDate;
    @XmlElement(name = "PassportIssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passportIssueDate;
    @XmlElementRef(name = "PassportIssuePlace", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportIssuePlace;
    @XmlElementRef(name = "PassportNo", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportNo;
    @XmlElement(name = "PassportType")
    protected Long passportType;
    @XmlElementRef(name = "PrevNationality", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prevNationality;
    @XmlElement(name = "Religion")
    protected Integer religion;
    @XmlElement(name = "RequireHealthInsurance")
    protected Boolean requireHealthInsurance;
    @XmlElement(name = "ResidenceDuration")
    protected Long residenceDuration;
    @XmlElementRef(name = "SponsorAddress", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sponsorAddress;
    @XmlElement(name = "SponsorID")
    protected Long sponsorID;
    @XmlElement(name = "UmrahProviderID")
    protected Long umrahProviderID;
    @XmlElementRef(name = "UmrahProviderName", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> umrahProviderName;
    @XmlElement(name = "ValidityDuration")
    protected Long validityDuration;
    @XmlElementRef(name = "ValidityPassingTo", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validityPassingTo;
    @XmlElementRef(name = "VisaCompanion", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<VisaCompanion> visaCompanion;
    @XmlElement(name = "VisaJobCode")
    protected Long visaJobCode;
    @XmlElement(name = "VisaNo")
    protected Long visaNo;
    @XmlElement(name = "VisaPermitNo")
    protected Long visaPermitNo;
    @XmlElement(name = "VisaType")
    protected Long visaType;

    /**
     * Gets the value of the bankOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankOrderNo() {
        return bankOrderNo;
    }

    /**
     * Sets the value of the bankOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankOrderNo(Long value) {
        this.bankOrderNo = value;
    }

    /**
     * Gets the value of the bioStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBioStatusFlag() {
        return bioStatusFlag;
    }

    /**
     * Sets the value of the bioStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBioStatusFlag(Long value) {
        this.bioStatusFlag = value;
    }

    /**
     * Gets the value of the biometricRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBiometricRefNo() {
        return biometricRefNo;
    }

    /**
     * Sets the value of the biometricRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBiometricRefNo(Long value) {
        this.biometricRefNo = value;
    }

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
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBirthPlace(JAXBElement<String> value) {
        this.birthPlace = value;
    }

    /**
     * Gets the value of the borderNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBorderNo() {
        return borderNo;
    }

    /**
     * Sets the value of the borderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBorderNo(Long value) {
        this.borderNo = value;
    }

    /**
     * Gets the value of the embVisaIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmbVisaIssueDate() {
        return embVisaIssueDate;
    }

    /**
     * Sets the value of the embVisaIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmbVisaIssueDate(Long value) {
        this.embVisaIssueDate = value;
    }

    /**
     * Gets the value of the embassyCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmbassyCode() {
        return embassyCode;
    }

    /**
     * Sets the value of the embassyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmbassyCode(Long value) {
        this.embassyCode = value;
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGender(Long value) {
        this.gender = value;
    }

    /**
     * Gets the value of the grandFatherNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrandFatherNameAr() {
        return grandFatherNameAr;
    }

    /**
     * Sets the value of the grandFatherNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrandFatherNameAr(JAXBElement<String> value) {
        this.grandFatherNameAr = value;
    }

    /**
     * Gets the value of the grandFatherNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrandFatherNameEn() {
        return grandFatherNameEn;
    }

    /**
     * Sets the value of the grandFatherNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrandFatherNameEn(JAXBElement<String> value) {
        this.grandFatherNameEn = value;
    }

    /**
     * Gets the value of the intendedForOmrah property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntendedForOmrah() {
        return intendedForOmrah;
    }

    /**
     * Sets the value of the intendedForOmrah property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntendedForOmrah(JAXBElement<String> value) {
        this.intendedForOmrah = value;
    }

    /**
     * Gets the value of the jobOrRelation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobOrRelation() {
        return jobOrRelation;
    }

    /**
     * Sets the value of the jobOrRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobOrRelation(JAXBElement<String> value) {
        this.jobOrRelation = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationality(JAXBElement<String> value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the numberOfEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfEntries() {
        return numberOfEntries;
    }

    /**
     * Sets the value of the numberOfEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfEntries(Long value) {
        this.numberOfEntries = value;
    }

    /**
     * Gets the value of the passportExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassportExpiryDate() {
        return passportExpiryDate;
    }

    /**
     * Sets the value of the passportExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassportExpiryDate(XMLGregorianCalendar value) {
        this.passportExpiryDate = value;
    }

    /**
     * Gets the value of the passportIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassportIssueDate() {
        return passportIssueDate;
    }

    /**
     * Sets the value of the passportIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassportIssueDate(XMLGregorianCalendar value) {
        this.passportIssueDate = value;
    }

    /**
     * Gets the value of the passportIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportIssuePlace() {
        return passportIssuePlace;
    }

    /**
     * Sets the value of the passportIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportIssuePlace(JAXBElement<String> value) {
        this.passportIssuePlace = value;
    }

    /**
     * Gets the value of the passportNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportNo() {
        return passportNo;
    }

    /**
     * Sets the value of the passportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportNo(JAXBElement<String> value) {
        this.passportNo = value;
    }

    /**
     * Gets the value of the passportType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassportType() {
        return passportType;
    }

    /**
     * Sets the value of the passportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassportType(Long value) {
        this.passportType = value;
    }

    /**
     * Gets the value of the prevNationality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrevNationality() {
        return prevNationality;
    }

    /**
     * Sets the value of the prevNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrevNationality(JAXBElement<String> value) {
        this.prevNationality = value;
    }

    /**
     * Gets the value of the religion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReligion() {
        return religion;
    }

    /**
     * Sets the value of the religion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReligion(Integer value) {
        this.religion = value;
    }

    /**
     * Gets the value of the requireHealthInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireHealthInsurance() {
        return requireHealthInsurance;
    }

    /**
     * Sets the value of the requireHealthInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireHealthInsurance(Boolean value) {
        this.requireHealthInsurance = value;
    }

    /**
     * Gets the value of the residenceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResidenceDuration() {
        return residenceDuration;
    }

    /**
     * Sets the value of the residenceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResidenceDuration(Long value) {
        this.residenceDuration = value;
    }

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

    /**
     * Gets the value of the umrahProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUmrahProviderID() {
        return umrahProviderID;
    }

    /**
     * Sets the value of the umrahProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUmrahProviderID(Long value) {
        this.umrahProviderID = value;
    }

    /**
     * Gets the value of the umrahProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUmrahProviderName() {
        return umrahProviderName;
    }

    /**
     * Sets the value of the umrahProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUmrahProviderName(JAXBElement<String> value) {
        this.umrahProviderName = value;
    }

    /**
     * Gets the value of the validityDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValidityDuration() {
        return validityDuration;
    }

    /**
     * Sets the value of the validityDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValidityDuration(Long value) {
        this.validityDuration = value;
    }

    /**
     * Gets the value of the validityPassingTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidityPassingTo() {
        return validityPassingTo;
    }

    /**
     * Sets the value of the validityPassingTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidityPassingTo(JAXBElement<String> value) {
        this.validityPassingTo = value;
    }

    /**
     * Gets the value of the visaCompanion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VisaCompanion }{@code >}
     *     
     */
    public JAXBElement<VisaCompanion> getVisaCompanion() {
        return visaCompanion;
    }

    /**
     * Sets the value of the visaCompanion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VisaCompanion }{@code >}
     *     
     */
    public void setVisaCompanion(JAXBElement<VisaCompanion> value) {
        this.visaCompanion = value;
    }

    /**
     * Gets the value of the visaJobCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaJobCode() {
        return visaJobCode;
    }

    /**
     * Sets the value of the visaJobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaJobCode(Long value) {
        this.visaJobCode = value;
    }

    /**
     * Gets the value of the visaNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaNo() {
        return visaNo;
    }

    /**
     * Sets the value of the visaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaNo(Long value) {
        this.visaNo = value;
    }

    /**
     * Gets the value of the visaPermitNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaPermitNo() {
        return visaPermitNo;
    }

    /**
     * Sets the value of the visaPermitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaPermitNo(Long value) {
        this.visaPermitNo = value;
    }

    /**
     * Gets the value of the visaType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisaType() {
        return visaType;
    }

    /**
     * Sets the value of the visaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisaType(Long value) {
        this.visaType = value;
    }

}
