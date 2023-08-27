
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExitEntryVisaClass_Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExitEntryVisaClass_Enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Single"/&gt;
 *     &lt;enumeration value="Multiple"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExitEntryVisaClass_Enum")
@XmlEnum
public enum ExitEntryVisaClassEnum {

    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Multiple")
    MULTIPLE("Multiple");
    private final String value;

    ExitEntryVisaClassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExitEntryVisaClassEnum fromValue(String v) {
        for (ExitEntryVisaClassEnum c: ExitEntryVisaClassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
