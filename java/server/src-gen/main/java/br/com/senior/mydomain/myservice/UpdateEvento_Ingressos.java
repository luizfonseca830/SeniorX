/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
 */
@CommandDescription(name="updateEvento_Ingressos", kind=CommandKind.Update, requestPrimitive="updateEvento_Ingressos", responsePrimitive="updateEvento_IngressosResponse")
public interface UpdateEvento_Ingressos extends MessageHandler {
    
    public Ingresso updateEvento_Ingressos(Ingresso toUpdate);
    
}
