/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
 */
@CommandDescription(name="createEvento_Ingressos", kind=CommandKind.Create, requestPrimitive="createEvento_Ingressos", responsePrimitive="createEvento_IngressosResponse")
public interface CreateEvento_Ingressos extends MessageHandler {
    
    public Ingresso createEvento_Ingressos(Ingresso toCreate);
    
}
