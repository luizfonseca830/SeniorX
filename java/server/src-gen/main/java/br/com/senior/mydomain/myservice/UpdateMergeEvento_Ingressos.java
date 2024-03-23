/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
 */
@CommandDescription(name="updateMergeEvento_Ingressos", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeEvento_Ingressos", responsePrimitive="updateMergeEvento_IngressosResponse")
public interface UpdateMergeEvento_Ingressos extends MessageHandler {
    
    public Ingresso updateMergeEvento_Ingressos(Ingresso toUpdateMerge);
    
}
