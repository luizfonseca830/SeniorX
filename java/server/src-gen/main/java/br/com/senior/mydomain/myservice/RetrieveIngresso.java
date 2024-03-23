/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Ingresso entity.
 */
@CommandDescription(name="retrieveIngresso", kind=CommandKind.Retrieve, requestPrimitive="retrieveIngresso", responsePrimitive="retrieveIngressoResponse")
public interface RetrieveIngresso extends MessageHandler {
    
    public Ingresso retrieveIngresso(Ingresso.GetRequest id);
    
}
