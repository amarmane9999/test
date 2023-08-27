
package sa.gov.mofa.schemas.esb._2014._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseDetail" type="{http://schemas.mofa.gov.sa/esb/2014/12/}ResponseDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDetails", propOrder = {
    "responseDetail"
})
public class ResponseDetails {

    @XmlElement(name = "ResponseDetail", nillable = true)
    protected List<ResponseDetail> responseDetail;

    /**
     * Gets the value of the responseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseDetail }
     * 
     * 
     */
    public List<ResponseDetail> getResponseDetail() {
        if (responseDetail == null) {
            responseDetail = new ArrayList<ResponseDetail>();
        }
        return this.responseDetail;
    }

}
