package com.tlacomblez.tp4.simple;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface = "com.tlacomblez.tp4.simple.HelloObjis")
@HandlerChain(file = "LogMessageHandler.xml")
public class HelloObjisWS implements HelloObjis {

    public String ditBonjour(String nom) {
        return "Hello," + nom + " !";
    }
}