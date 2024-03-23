/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
 */
@CommandDescription(name="retrieveEvento_Ingressos", kind=CommandKind.Retrieve, requestPrimitive="retrieveEvento_Ingressos", responsePrimitive="retrieveEvento_IngressosResponse")
public interface RetrieveEvento_Ingressos extends MessageHandler {
    
    public Ingresso retrieveEvento_Ingressos(Ingresso.GetRequest id);
    
}
