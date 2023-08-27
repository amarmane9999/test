
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVisaStatus_x0020_ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVisaStatus_x0020_"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VisaStatus_x0020_" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}VisaStatus_x0020_" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVisaStatus_x0020_", propOrder = {
    "visaStatusX0020"
})
public class ArrayOfVisaStatusX0020 {

    @XmlElement(name = "VisaStatus_x0020_", nillable = true)
    protected List<VisaStatusX0020> visaStatusX0020;

    /**
     * Gets the value of the visaStatusX0020 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visaStatusX0020 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisaStatusX0020().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisaStatusX0020 }
     * 
     * 
     */
    public List<VisaStatusX0020> getVisaStatusX0020() {
        if (visaStatusX0020 == null) {
            visaStatusX0020 = new ArrayList<VisaStatusX0020>();
        }
        return this.visaStatusX0020;
    }

}
