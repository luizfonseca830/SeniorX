/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Evento entity.
 */
@CommandDescription(name="listEvento", kind=CommandKind.List, requestPrimitive="listEvento", responsePrimitive="listEventoResponse")
public interface ListEvento extends MessageHandler {
    
    public Evento.PagedResults listEvento(Evento.PageRequest pageRequest);
    
}
