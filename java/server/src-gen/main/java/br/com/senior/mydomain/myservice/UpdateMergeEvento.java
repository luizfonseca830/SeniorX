/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Evento entity.
 */
@CommandDescription(name="updateMergeEvento", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeEvento", responsePrimitive="updateMergeEventoResponse")
public interface UpdateMergeEvento extends MessageHandler {
    
    public Evento updateMergeEvento(Evento toUpdateMerge);
    
}
