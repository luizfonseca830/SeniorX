/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Convidado entity.
 */
@CommandDescription(name="retrieveConvidado", kind=CommandKind.Retrieve, requestPrimitive="retrieveConvidado", responsePrimitive="retrieveConvidadoResponse")
public interface RetrieveConvidado extends MessageHandler {
    
    public Convidado retrieveConvidado(Convidado.GetRequest id);
    
}
