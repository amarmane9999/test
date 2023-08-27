
package sa.gov.mofa.schemas.esb._2014._12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatuses.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResponseStatuses"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="SuccessWithWarnings"/&gt;
 *     &lt;enumeration value="Failure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseStatuses")
@XmlEnum
public enum ResponseStatuses {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("SuccessWithWarnings")
    SUCCESS_WITH_WARNINGS("SuccessWithWarnings"),
    @XmlEnumValue("Failure")
    FAILURE("Failure");
    private final String value;

    ResponseStatuses(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseStatuses fromValue(String v) {
        for (ResponseStatuses c: ResponseStatuses.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
