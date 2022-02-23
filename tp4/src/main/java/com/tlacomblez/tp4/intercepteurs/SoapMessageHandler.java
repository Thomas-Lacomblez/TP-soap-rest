package com.tlacomblez.tp4.intercepteurs;

import java.io.IOException;
import java.util.Set;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.namespace.QName;

public class SoapMessageHandler implements SOAPHandler<SOAPMessageContext> {

    @Override
    public void close(MessageContext arg0) {

    }

    @Override
    public boolean handleFault(SOAPMessageContext arg0) {
        return false;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        SOAPMessage msg = context.getMessage();

        try {
            msg.writeTo(System.out);
        } catch(SOAPException | IOException e) {
            
        }

        return false;
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }


}