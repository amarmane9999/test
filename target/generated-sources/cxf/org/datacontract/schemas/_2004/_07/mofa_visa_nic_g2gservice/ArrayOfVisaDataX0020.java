
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVisaData_x0020_ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVisaData_x0020_"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VisaData_x0020_" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService.ServiceSchema}VisaData_x0020_" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVisaData_x0020_", propOrder = {
    "visaDataX0020"
})
public class ArrayOfVisaDataX0020 {

    @XmlElement(name = "VisaData_x0020_", nillable = true)
    protected List<VisaDataX0020> visaDataX0020;

    /**
     * Gets the value of the visaDataX0020 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visaDataX0020 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisaDataX0020().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisaDataX0020 }
     * 
     * 
     */
    public List<VisaDataX0020> getVisaDataX0020() {
        if (visaDataX0020 == null) {
            visaDataX0020 = new ArrayList<VisaDataX0020>();
        }
        return this.visaDataX0020;
    }

}
