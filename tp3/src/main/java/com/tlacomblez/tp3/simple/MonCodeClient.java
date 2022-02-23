package com.tlacomblez.tp3.simple;

public class MonCodeClient {
    public static void main(String[] args) {
        HelloObjisWSService monService = new HelloObjisWSService();

        HelloObjis port = monService.getHelloObjisWSPort();

        String resultat = port.ditBonjour("Objis");

        System.out.println(resultat);
    }
}
