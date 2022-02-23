
package com.tlacomblez.tp3.converter;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TempConvertSoap", targetNamespace = "https://www.w3schools.com/xml/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TempConvertSoap {


    /**
     * 
     * @param fahrenheit
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "FahrenheitToCelsius", action = "https://www.w3schools.com/xml/FahrenheitToCelsius")
    @WebResult(name = "FahrenheitToCelsiusResult", targetNamespace = "https://www.w3schools.com/xml/")
    @RequestWrapper(localName = "FahrenheitToCelsius", targetNamespace = "https://www.w3schools.com/xml/", className = "com.tlacomblez.tp3.converter.FahrenheitToCelsius")
    @ResponseWrapper(localName = "FahrenheitToCelsiusResponse", targetNamespace = "https://www.w3schools.com/xml/", className = "com.tlacomblez.tp3.converter.FahrenheitToCelsiusResponse")
    public String fahrenheitToCelsius(
        @WebParam(name = "Fahrenheit", targetNamespace = "https://www.w3schools.com/xml/")
        String fahrenheit);

    /**
     * 
     * @param celsius
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CelsiusToFahrenheit", action = "https://www.w3schools.com/xml/CelsiusToFahrenheit")
    @WebResult(name = "CelsiusToFahrenheitResult", targetNamespace = "https://www.w3schools.com/xml/")
    @RequestWrapper(localName = "CelsiusToFahrenheit", targetNamespace = "https://www.w3schools.com/xml/", className = "com.tlacomblez.tp3.converter.CelsiusToFahrenheit")
    @ResponseWrapper(localName = "CelsiusToFahrenheitResponse", targetNamespace = "https://www.w3schools.com/xml/", className = "com.tlacomblez.tp3.converter.CelsiusToFahrenheitResponse")
    public String celsiusToFahrenheit(
        @WebParam(name = "Celsius", targetNamespace = "https://www.w3schools.com/xml/")
        String celsius);

}
