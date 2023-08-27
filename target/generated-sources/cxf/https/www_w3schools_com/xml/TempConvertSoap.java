package https.www_w3schools_com.xml;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.5.redhat-00041
 * 2023-08-27T11:23:44.699+03:00
 * Generated source version: 3.5.5.redhat-00041
 *
 */
@WebService(targetNamespace = "https://www.w3schools.com/xml/", name = "TempConvertSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface TempConvertSoap {

    @WebMethod(operationName = "CelsiusToFahrenheit", action = "https://www.w3schools.com/xml/CelsiusToFahrenheit")
    @RequestWrapper(localName = "CelsiusToFahrenheit", targetNamespace = "https://www.w3schools.com/xml/", className = "https.www_w3schools_com.xml.CelsiusToFahrenheit")
    @ResponseWrapper(localName = "CelsiusToFahrenheitResponse", targetNamespace = "https://www.w3schools.com/xml/", className = "https.www_w3schools_com.xml.CelsiusToFahrenheitResponse")
    @WebResult(name = "CelsiusToFahrenheitResult", targetNamespace = "https://www.w3schools.com/xml/")
    public java.lang.String celsiusToFahrenheit(

        @WebParam(name = "Celsius", targetNamespace = "https://www.w3schools.com/xml/")
        java.lang.String celsius
    );

    @WebMethod(operationName = "FahrenheitToCelsius", action = "https://www.w3schools.com/xml/FahrenheitToCelsius")
    @RequestWrapper(localName = "FahrenheitToCelsius", targetNamespace = "https://www.w3schools.com/xml/", className = "https.www_w3schools_com.xml.FahrenheitToCelsius")
    @ResponseWrapper(localName = "FahrenheitToCelsiusResponse", targetNamespace = "https://www.w3schools.com/xml/", className = "https.www_w3schools_com.xml.FahrenheitToCelsiusResponse")
    @WebResult(name = "FahrenheitToCelsiusResult", targetNamespace = "https://www.w3schools.com/xml/")
    public java.lang.String fahrenheitToCelsius(

        @WebParam(name = "Fahrenheit", targetNamespace = "https://www.w3schools.com/xml/")
        java.lang.String fahrenheit
    );
}
