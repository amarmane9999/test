
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdouble;


/**
 * <p>Java class for GetDeletedWorkVisaResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDeletedWorkVisaResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BorderNumbers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfdouble" minOccurs="0"/&gt;
 *         &lt;element name="NoOfPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDeletedWorkVisaResponseMessage", propOrder = {
    "borderNumbers",
    "noOfPages"
})
public class GetDeletedWorkVisaResponseMessage {

    @XmlElementRef(name = "BorderNumbers", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfdouble> borderNumbers;
    @XmlElement(name = "NoOfPages")
    protected Integer noOfPages;

    /**
     * Gets the value of the borderNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     *     
     */
    public JAXBElement<ArrayOfdouble> getBorderNumbers() {
        return borderNumbers;
    }

    /**
     * Sets the value of the borderNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     *     
     */
    public void setBorderNumbers(JAXBElement<ArrayOfdouble> value) {
        this.borderNumbers = value;
    }

    /**
     * Gets the value of the noOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfPages() {
        return noOfPages;
    }

    /**
     * Sets the value of the noOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfPages(Integer value) {
        this.noOfPages = value;
    }

}
