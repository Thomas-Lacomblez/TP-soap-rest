package com.tlacomblez.tp2.simple;

import javax.jws.WebService;

@WebService(endpointInterface = "com.tlacomblez.tp2.simple.HelloObjis")

public class HelloObjisWS implements HelloObjis {

    public String ditBonjour(String nom) {
        return "Hello," + nom + " !";
    }
}