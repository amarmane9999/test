
package sa.gov.mofa.schemas.esb._2014._12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeverityLevels.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SeverityLevels"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Information"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="FatalError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SeverityLevels")
@XmlEnum
public enum SeverityLevels {

    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("FatalError")
    FATAL_ERROR("FatalError");
    private final String value;

    SeverityLevels(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityLevels fromValue(String v) {
        for (SeverityLevels c: SeverityLevels.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
