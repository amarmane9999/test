
package sa.gov.mofa.schemas.esb._2014._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseStatus" type="{http://schemas.mofa.gov.sa/esb/2014/12/}ResponseStatuses" minOccurs="0"/&gt;
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeverityLevel" type="{http://schemas.mofa.gov.sa/esb/2014/12/}SeverityLevels" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDetails" type="{http://schemas.mofa.gov.sa/esb/2014/12/}ResponseDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseResult", propOrder = {
    "responseStatus",
    "responseCode",
    "responseMessage",
    "severityLevel",
    "responseDetails"
})
public class ResponseResult {

    @XmlElement(name = "ResponseStatus")
    @XmlSchemaType(name = "string")
    protected ResponseStatuses responseStatus;
    @XmlElement(name = "ResponseCode")
    protected Integer responseCode;
    @XmlElementRef(name = "ResponseMessage", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseMessage;
    @XmlElement(name = "SeverityLevel")
    @XmlSchemaType(name = "string")
    protected SeverityLevels severityLevel;
    @XmlElementRef(name = "ResponseDetails", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseDetails> responseDetails;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatuses }
     *     
     */
    public ResponseStatuses getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatuses }
     *     
     */
    public void setResponseStatus(ResponseStatuses value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseMessage(JAXBElement<String> value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the severityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityLevels }
     *     
     */
    public SeverityLevels getSeverityLevel() {
        return severityLevel;
    }

    /**
     * Sets the value of the severityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityLevels }
     *     
     */
    public void setSeverityLevel(SeverityLevels value) {
        this.severityLevel = value;
    }

    /**
     * Gets the value of the responseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResponseDetails }{@code >}
     *     
     */
    public JAXBElement<ResponseDetails> getResponseDetails() {
        return responseDetails;
    }

    /**
     * Sets the value of the responseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResponseDetails }{@code >}
     *     
     */
    public void setResponseDetails(JAXBElement<ResponseDetails> value) {
        this.responseDetails = value;
    }

}
