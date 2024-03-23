/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Evento entity.
 */
@CommandDescription(name="createMergeEvento", kind=CommandKind.CreateMerge, requestPrimitive="createMergeEvento", responsePrimitive="createMergeEventoResponse")
public interface CreateMergeEvento extends MessageHandler {
    
    public Evento createMergeEvento(Evento toCreateMerge);
    
}
