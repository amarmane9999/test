
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VisaStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VisaStatusEnum")
@XmlEnum
public enum VisaStatusEnum {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    VisaStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VisaStatusEnum fromValue(String v) {
        for (VisaStatusEnum c: VisaStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
