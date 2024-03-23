/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
 */
@CommandDescription(name="listEvento_Ingressos", kind=CommandKind.List, requestPrimitive="listEvento_Ingressos", responsePrimitive="listEvento_IngressosResponse")
public interface ListEvento_Ingressos extends MessageHandler {
    
    public Ingresso.PagedResults listEvento_Ingressos(Ingresso.PageRequest pageRequest);
    
}
