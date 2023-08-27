
package org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gender_Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Gender_Enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Undefined"/&gt;
 *     &lt;enumeration value="Male"/&gt;
 *     &lt;enumeration value="Female"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Gender_Enum")
@XmlEnum
public enum GenderEnum {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Male")
    MALE("Male"),
    @XmlEnumValue("Female")
    FEMALE("Female");
    private final String value;

    GenderEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenderEnum fromValue(String v) {
        for (GenderEnum c: GenderEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
