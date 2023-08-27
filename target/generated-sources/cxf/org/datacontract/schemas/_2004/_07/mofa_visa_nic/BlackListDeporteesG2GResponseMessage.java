
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ArrayOfBlackListData;


/**
 * <p>Java class for BlackListDeporteesG2gResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlackListDeporteesG2gResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BlackListData" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}ArrayOfBlackListData" minOccurs="0"/&gt;
 *         &lt;element name="Deported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlackListDeporteesG2gResponseMessage", propOrder = {
    "blackListData",
    "deported"
})
public class BlackListDeporteesG2GResponseMessage {

    @XmlElementRef(name = "BlackListData", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBlackListData> blackListData;
    @XmlElement(name = "Deported")
    protected Boolean deported;

    /**
     * Gets the value of the blackListData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBlackListData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBlackListData> getBlackListData() {
        return blackListData;
    }

    /**
     * Sets the value of the blackListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBlackListData }{@code >}
     *     
     */
    public void setBlackListData(JAXBElement<ArrayOfBlackListData> value) {
        this.blackListData = value;
    }

    /**
     * Gets the value of the deported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeported() {
        return deported;
    }

    /**
     * Sets the value of the deported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeported(Boolean value) {
        this.deported = value;
    }

}
