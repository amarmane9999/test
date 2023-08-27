
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.DeporteesData;


/**
 * <p>Java class for DeporteesResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeporteesResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeporteesData" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}DeporteesData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeporteesResponseMessage", propOrder = {
    "deporteesData"
})
public class DeporteesResponseMessage {

    @XmlElementRef(name = "DeporteesData", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<DeporteesData> deporteesData;

    /**
     * Gets the value of the deporteesData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeporteesData }{@code >}
     *     
     */
    public JAXBElement<DeporteesData> getDeporteesData() {
        return deporteesData;
    }

    /**
     * Sets the value of the deporteesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeporteesData }{@code >}
     *     
     */
    public void setDeporteesData(JAXBElement<DeporteesData> value) {
        this.deporteesData = value;
    }

}
