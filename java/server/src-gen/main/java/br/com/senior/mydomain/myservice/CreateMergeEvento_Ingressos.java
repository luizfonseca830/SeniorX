/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
 */
@CommandDescription(name="createMergeEvento_Ingressos", kind=CommandKind.CreateMerge, requestPrimitive="createMergeEvento_Ingressos", responsePrimitive="createMergeEvento_IngressosResponse")
public interface CreateMergeEvento_Ingressos extends MessageHandler {
    
    public Ingresso createMergeEvento_Ingressos(Ingresso toCreateMerge);
    
}
