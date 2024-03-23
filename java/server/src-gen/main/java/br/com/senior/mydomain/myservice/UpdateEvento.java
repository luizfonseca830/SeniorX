/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Evento entity.
 */
@CommandDescription(name="updateEvento", kind=CommandKind.Update, requestPrimitive="updateEvento", responsePrimitive="updateEventoResponse")
public interface UpdateEvento extends MessageHandler {
    
    public Evento updateEvento(Evento toUpdate);
    
}
