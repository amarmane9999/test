
package org.datacontract.schemas._2004._07.mofa_visa_nic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWorkVisaDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkVisaDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkVisaDetail" type="{http://schemas.datacontract.org/2004/07/Mofa.Visa.Nic.G2GService}WorkVisaDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkVisaDetail", propOrder = {
    "workVisaDetail"
})
public class ArrayOfWorkVisaDetail {

    @XmlElement(name = "WorkVisaDetail", nillable = true)
    protected List<WorkVisaDetail> workVisaDetail;

    /**
     * Gets the value of the workVisaDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workVisaDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkVisaDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkVisaDetail }
     * 
     * 
     */
    public List<WorkVisaDetail> getWorkVisaDetail() {
        if (workVisaDetail == null) {
            workVisaDetail = new ArrayList<WorkVisaDetail>();
        }
        return this.workVisaDetail;
    }

}
