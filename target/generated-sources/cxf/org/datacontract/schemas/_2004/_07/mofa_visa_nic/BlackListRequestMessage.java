
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.BlackListParam;


/**
 * <p>Java class for BlackListRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlackListRequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BlackListParam" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}BlackListParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlackListRequestMessage", propOrder = {
    "blackListParam"
})
public class BlackListRequestMessage {

    @XmlElementRef(name = "BlackListParam", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<BlackListParam> blackListParam;

    /**
     * Gets the value of the blackListParam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BlackListParam }{@code >}
     *     
     */
    public JAXBElement<BlackListParam> getBlackListParam() {
        return blackListParam;
    }

    /**
     * Sets the value of the blackListParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BlackListParam }{@code >}
     *     
     */
    public void setBlackListParam(JAXBElement<BlackListParam> value) {
        this.blackListParam = value;
    }

}
