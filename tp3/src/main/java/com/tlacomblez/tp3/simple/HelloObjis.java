
package com.tlacomblez.tp3.simple;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloObjis", targetNamespace = "http://simple.tp2.tlacomblez.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloObjis {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://simple.tp2.tlacomblez.com/HelloObjis/ditBonjourRequest", output = "http://simple.tp2.tlacomblez.com/HelloObjis/ditBonjourResponse")
    public String ditBonjour(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}
