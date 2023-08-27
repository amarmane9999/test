
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExitEntryVisaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExitEntryVisaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExitEntryVisaClass" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}ExitEntryVisaClass_Enum" minOccurs="0"/&gt;
 *         &lt;element name="ExitEntryVisaExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IqamaExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastExitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExitEntryVisaData", propOrder = {
    "exitEntryVisaClass",
    "exitEntryVisaExpiryDate",
    "iqamaExpiryDate",
    "lastExitDate"
})
public class ExitEntryVisaData {

    @XmlElement(name = "ExitEntryVisaClass")
    @XmlSchemaType(name = "string")
    protected ExitEntryVisaClassEnum exitEntryVisaClass;
    @XmlElement(name = "ExitEntryVisaExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exitEntryVisaExpiryDate;
    @XmlElement(name = "IqamaExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar iqamaExpiryDate;
    @XmlElement(name = "LastExitDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastExitDate;

    /**
     * Gets the value of the exitEntryVisaClass property.
     * 
     * @return
     *     possible object is
     *     {@link ExitEntryVisaClassEnum }
     *     
     */
    public ExitEntryVisaClassEnum getExitEntryVisaClass() {
        return exitEntryVisaClass;
    }

    /**
     * Sets the value of the exitEntryVisaClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExitEntryVisaClassEnum }
     *     
     */
    public void setExitEntryVisaClass(ExitEntryVisaClassEnum value) {
        this.exitEntryVisaClass = value;
    }

    /**
     * Gets the value of the exitEntryVisaExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExitEntryVisaExpiryDate() {
        return exitEntryVisaExpiryDate;
    }

    /**
     * Sets the value of the exitEntryVisaExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExitEntryVisaExpiryDate(XMLGregorianCalendar value) {
        this.exitEntryVisaExpiryDate = value;
    }

    /**
     * Gets the value of the iqamaExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIqamaExpiryDate() {
        return iqamaExpiryDate;
    }

    /**
     * Sets the value of the iqamaExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIqamaExpiryDate(XMLGregorianCalendar value) {
        this.iqamaExpiryDate = value;
    }

    /**
     * Gets the value of the lastExitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastExitDate() {
        return lastExitDate;
    }

    /**
     * Sets the value of the lastExitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastExitDate(XMLGregorianCalendar value) {
        this.lastExitDate = value;
    }

}
