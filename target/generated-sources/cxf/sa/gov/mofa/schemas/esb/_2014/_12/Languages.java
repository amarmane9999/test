
package sa.gov.mofa.schemas.esb._2014._12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Languages.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Languages"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="En"/&gt;
 *     &lt;enumeration value="Ar"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Languages")
@XmlEnum
public enum Languages {

    @XmlEnumValue("En")
    EN("En"),
    @XmlEnumValue("Ar")
    AR("Ar");
    private final String value;

    Languages(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Languages fromValue(String v) {
        for (Languages c: Languages.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
