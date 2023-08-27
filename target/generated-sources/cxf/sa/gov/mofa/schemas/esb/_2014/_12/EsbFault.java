
package sa.gov.mofa.schemas.esb._2014._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EsbFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EsbFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeverityLevel" type="{http://schemas.mofa.gov.sa/esb/2014/12/}SeverityLevels" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDetails" type="{http://schemas.mofa.gov.sa/esb/2014/12/}ErrorDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsbFault", propOrder = {
    "errorCode",
    "errorMessage",
    "severityLevel",
    "errorDetails"
})
public class EsbFault {

    @XmlElement(name = "ErrorCode")
    protected Integer errorCode;
    @XmlElementRef(name = "ErrorMessage", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;
    @XmlElement(name = "SeverityLevel")
    @XmlSchemaType(name = "string")
    protected SeverityLevels severityLevel;
    @XmlElementRef(name = "ErrorDetails", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrorDetails> errorDetails;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
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
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ErrorDetails }{@code >}
     *     
     */
    public JAXBElement<ErrorDetails> getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ErrorDetails }{@code >}
     *     
     */
    public void setErrorDetails(JAXBElement<ErrorDetails> value) {
        this.errorDetails = value;
    }

}
