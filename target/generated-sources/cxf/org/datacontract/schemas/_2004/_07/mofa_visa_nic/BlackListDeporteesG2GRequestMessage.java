
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.BlackListDeporteesParam;


/**
 * <p>Java class for BlackListDeporteesG2gRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlackListDeporteesG2gRequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BlackListDeporteesParam" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}BlackListDeporteesParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlackListDeporteesG2gRequestMessage", propOrder = {
    "blackListDeporteesParam"
})
public class BlackListDeporteesG2GRequestMessage {

    @XmlElementRef(name = "BlackListDeporteesParam", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<BlackListDeporteesParam> blackListDeporteesParam;

    /**
     * Gets the value of the blackListDeporteesParam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BlackListDeporteesParam }{@code >}
     *     
     */
    public JAXBElement<BlackListDeporteesParam> getBlackListDeporteesParam() {
        return blackListDeporteesParam;
    }

    /**
     * Sets the value of the blackListDeporteesParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BlackListDeporteesParam }{@code >}
     *     
     */
    public void setBlackListDeporteesParam(JAXBElement<BlackListDeporteesParam> value) {
        this.blackListDeporteesParam = value;
    }

}
