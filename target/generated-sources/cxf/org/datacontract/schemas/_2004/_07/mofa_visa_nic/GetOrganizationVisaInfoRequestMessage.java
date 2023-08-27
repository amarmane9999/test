
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetOrganizationVisaInfoRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrganizationVisaInfoRequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyEstablishmentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrganizationVisaInfoRequestMessage", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", propOrder = {
    "companyEstablishmentID",
    "fromDate",
    "operatorID"
})
public class GetOrganizationVisaInfoRequestMessage {

    @XmlElement(name = "CompanyEstablishmentID")
    protected Long companyEstablishmentID;
    @XmlElement(name = "FromDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "OperatorID")
    protected Long operatorID;

    /**
     * Gets the value of the companyEstablishmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompanyEstablishmentID() {
        return companyEstablishmentID;
    }

    /**
     * Sets the value of the companyEstablishmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompanyEstablishmentID(Long value) {
        this.companyEstablishmentID = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the operatorID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperatorID() {
        return operatorID;
    }

    /**
     * Sets the value of the operatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperatorID(Long value) {
        this.operatorID = value;
    }

}
