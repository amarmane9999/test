
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ExitEntryVisaParam;


/**
 * <p>Java class for GetExitEntryVisaWithResidentInfoRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetExitEntryVisaWithResidentInfoRequestMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExitEntryVisaParam" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}ExitEntryVisaParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetExitEntryVisaWithResidentInfoRequestMessage", propOrder = {
    "exitEntryVisaParam"
})
public class GetExitEntryVisaWithResidentInfoRequestMessage {

    @XmlElementRef(name = "ExitEntryVisaParam", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService", type = JAXBElement.class, required = false)
    protected JAXBElement<ExitEntryVisaParam> exitEntryVisaParam;

    /**
     * Gets the value of the exitEntryVisaParam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExitEntryVisaParam }{@code >}
     *     
     */
    public JAXBElement<ExitEntryVisaParam> getExitEntryVisaParam() {
        return exitEntryVisaParam;
    }

    /**
     * Sets the value of the exitEntryVisaParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExitEntryVisaParam }{@code >}
     *     
     */
    public void setExitEntryVisaParam(JAXBElement<ExitEntryVisaParam> value) {
        this.exitEntryVisaParam = value;
    }

}
