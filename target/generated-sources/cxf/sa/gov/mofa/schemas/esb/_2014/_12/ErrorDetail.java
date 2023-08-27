
package sa.gov.mofa.schemas.esb._2014._12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeverityLevel" type="{http://schemas.mofa.gov.sa/esb/2014/12/}SeverityLevels" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetail", propOrder = {
    "code",
    "message",
    "severityLevel"
})
public class ErrorDetail {

    @XmlElement(name = "Code")
    protected Integer code;
    @XmlElementRef(name = "Message", namespace = "http://schemas.mofa.gov.sa/esb/2014/12/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElement(name = "SeverityLevel")
    @XmlSchemaType(name = "string")
    protected SeverityLevels severityLevel;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCode(Integer value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
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

}
