/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
 */
@CommandDescription(name="deleteEvento_Ingressos", kind=CommandKind.Delete, requestPrimitive="deleteEvento_Ingressos", responsePrimitive="deleteEvento_IngressosResponse")
public interface DeleteEvento_Ingressos extends MessageHandler {
    
    public void deleteEvento_Ingressos(Ingresso.Id id);
    
}
