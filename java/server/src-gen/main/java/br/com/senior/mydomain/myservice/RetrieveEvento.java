/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Evento entity.
 */
@CommandDescription(name="retrieveEvento", kind=CommandKind.Retrieve, requestPrimitive="retrieveEvento", responsePrimitive="retrieveEventoResponse")
public interface RetrieveEvento extends MessageHandler {
    
    public Evento retrieveEvento(Evento.GetRequest id);
    
}
