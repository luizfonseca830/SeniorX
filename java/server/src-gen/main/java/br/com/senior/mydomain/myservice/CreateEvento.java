/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Evento entity.
 */
@CommandDescription(name="createEvento", kind=CommandKind.Create, requestPrimitive="createEvento", responsePrimitive="createEventoResponse")
public interface CreateEvento extends MessageHandler {
    
    public Evento createEvento(Evento toCreate);
    
}
