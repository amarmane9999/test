
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.DeporteesParam;


/**
 * <p>Java class for DeporteesRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeporteesRequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeporteesRequestParam" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}DeporteesParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeporteesRequestMessage", propOrder = {
    "deporteesRequestParam"
})
public class DeporteesRequestMessage {

    @XmlElementRef(name = "DeporteesRequestParam", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<DeporteesParam> deporteesRequestParam;

    /**
     * Gets the value of the deporteesRequestParam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeporteesParam }{@code >}
     *     
     */
    public JAXBElement<DeporteesParam> getDeporteesRequestParam() {
        return deporteesRequestParam;
    }

    /**
     * Sets the value of the deporteesRequestParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeporteesParam }{@code >}
     *     
     */
    public void setDeporteesRequestParam(JAXBElement<DeporteesParam> value) {
        this.deporteesRequestParam = value;
    }

}
