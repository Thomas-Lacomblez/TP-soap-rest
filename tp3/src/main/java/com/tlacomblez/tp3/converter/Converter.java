package com.tlacomblez.tp3.converter;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)

public interface Converter {
    Double FarehneitToCelsius(Double tempF);

    Double CelsiusToFarehneit(Double tempC);
}
