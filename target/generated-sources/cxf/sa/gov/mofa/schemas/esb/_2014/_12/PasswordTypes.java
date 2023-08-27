
package sa.gov.mofa.schemas.esb._2014._12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PasswordTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PasswordTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Clear"/&gt;
 *     &lt;enumeration value="HashedSha1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PasswordTypes")
@XmlEnum
public enum PasswordTypes {

    @XmlEnumValue("Clear")
    CLEAR("Clear"),
    @XmlEnumValue("HashedSha1")
    HASHED_SHA_1("HashedSha1");
    private final String value;

    PasswordTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PasswordTypes fromValue(String v) {
        for (PasswordTypes c: PasswordTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
