
package sa.gov.mofa.schemas.esb._2014._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContextInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/&gt;
 *         &lt;element name="Language" type="{http://schemas.mofa.gov.sa/esb/2014/12/}Languages"/&gt;
 *         &lt;element name="ClientUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ClientUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ClientSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerStationIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransmissionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExtraMetadata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextInformation", propOrder = {
    "messageId",
    "language",
    "clientUserId",
    "clientUsername",
    "clientDisplayName",
    "clientDateTime",
    "clientSessionId",
    "clientIp",
    "consumerStationName",
    "consumerStationIp",
    "transmissionTimestamp",
    "extraMetadata",
    "transactionId"
})
public class ContextInformation {

    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "Language", required = true)
    @XmlSchemaType(name = "string")
    protected Languages language;
    @XmlElement(name = "ClientUserId")
    protected Long clientUserId;
    @XmlElementRef(name = "ClientUsername", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientUsername;
    @XmlElementRef(name = "ClientDisplayName", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientDisplayName;
    @XmlElementRef(name = "ClientDateTime", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> clientDateTime;
    @XmlElementRef(name = "ClientSessionId", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientSessionId;
    @XmlElementRef(name = "ClientIp", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientIp;
    @XmlElementRef(name = "ConsumerStationName", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumerStationName;
    @XmlElementRef(name = "ConsumerStationIp", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumerStationIp;
    @XmlElement(name = "TransmissionTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transmissionTimestamp;
    @XmlElementRef(name = "ExtraMetadata", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extraMetadata;
    @XmlElement(name = "TransactionId")
    protected String transactionId;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Languages }
     *     
     */
    public Languages getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Languages }
     *     
     */
    public void setLanguage(Languages value) {
        this.language = value;
    }

    /**
     * Gets the value of the clientUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientUserId() {
        return clientUserId;
    }

    /**
     * Sets the value of the clientUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientUserId(Long value) {
        this.clientUserId = value;
    }

    /**
     * Gets the value of the clientUsername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientUsername() {
        return clientUsername;
    }

    /**
     * Sets the value of the clientUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientUsername(JAXBElement<String> value) {
        this.clientUsername = value;
    }

    /**
     * Gets the value of the clientDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientDisplayName() {
        return clientDisplayName;
    }

    /**
     * Sets the value of the clientDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientDisplayName(JAXBElement<String> value) {
        this.clientDisplayName = value;
    }

    /**
     * Gets the value of the clientDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getClientDateTime() {
        return clientDateTime;
    }

    /**
     * Sets the value of the clientDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setClientDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.clientDateTime = value;
    }

    /**
     * Gets the value of the clientSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientSessionId() {
        return clientSessionId;
    }

    /**
     * Sets the value of the clientSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientSessionId(JAXBElement<String> value) {
        this.clientSessionId = value;
    }

    /**
     * Gets the value of the clientIp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientIp() {
        return clientIp;
    }

    /**
     * Sets the value of the clientIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientIp(JAXBElement<String> value) {
        this.clientIp = value;
    }

    /**
     * Gets the value of the consumerStationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerStationName() {
        return consumerStationName;
    }

    /**
     * Sets the value of the consumerStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerStationName(JAXBElement<String> value) {
        this.consumerStationName = value;
    }

    /**
     * Gets the value of the consumerStationIp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerStationIp() {
        return consumerStationIp;
    }

    /**
     * Sets the value of the consumerStationIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerStationIp(JAXBElement<String> value) {
        this.consumerStationIp = value;
    }

    /**
     * Gets the value of the transmissionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransmissionTimestamp() {
        return transmissionTimestamp;
    }

    /**
     * Sets the value of the transmissionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransmissionTimestamp(XMLGregorianCalendar value) {
        this.transmissionTimestamp = value;
    }

    /**
     * Gets the value of the extraMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtraMetadata() {
        return extraMetadata;
    }

    /**
     * Sets the value of the extraMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtraMetadata(JAXBElement<String> value) {
        this.extraMetadata = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

}
