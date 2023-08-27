
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetNicRejectedVisaRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNicRejectedVisaRequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RejectedVisaDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNicRejectedVisaRequestMessage", propOrder = {
    "rejectedVisaDate"
})
public class GetNicRejectedVisaRequestMessage {

    @XmlElement(name = "RejectedVisaDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rejectedVisaDate;

    /**
     * Gets the value of the rejectedVisaDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRejectedVisaDate() {
        return rejectedVisaDate;
    }

    /**
     * Sets the value of the rejectedVisaDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRejectedVisaDate(XMLGregorianCalendar value) {
        this.rejectedVisaDate = value;
    }

}
