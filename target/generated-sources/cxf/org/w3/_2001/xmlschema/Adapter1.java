
package org.w3._2001.xmlschema;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, LocalDateTime>
{


    public LocalDateTime unmarshal(String value) {
        return (sample.camel.adapter.DataTypeAdapter.parseDateTime(value));
    }

    public String marshal(LocalDateTime value) {
        return (sample.camel.adapter.DataTypeAdapter.printDateTime(value));
    }

}
