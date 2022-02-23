package com.tlacomblez.tp2.simple;


import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface HelloObjis {
    String ditBonjour(String name);
}