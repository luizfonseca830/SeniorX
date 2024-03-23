/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Evento entity.
 */
@CommandDescription(name="deleteEvento", kind=CommandKind.Delete, requestPrimitive="deleteEvento", responsePrimitive="deleteEventoResponse")
public interface DeleteEvento extends MessageHandler {
    
    public void deleteEvento(Evento.Id id);
    
}
