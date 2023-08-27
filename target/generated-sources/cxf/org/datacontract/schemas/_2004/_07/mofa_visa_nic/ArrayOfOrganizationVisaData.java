
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrganizationVisaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrganizationVisaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganizationVisaData" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema}OrganizationVisaData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrganizationVisaData", namespace = "http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.ServiceSchema", propOrder = {
    "organizationVisaData"
})
public class ArrayOfOrganizationVisaData {

    @XmlElement(name = "OrganizationVisaData", nillable = true)
    protected List<OrganizationVisaData> organizationVisaData;

    /**
     * Gets the value of the organizationVisaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationVisaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationVisaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationVisaData }
     * 
     * 
     */
    public List<OrganizationVisaData> getOrganizationVisaData() {
        if (organizationVisaData == null) {
            organizationVisaData = new ArrayList<OrganizationVisaData>();
        }
        return this.organizationVisaData;
    }

}
