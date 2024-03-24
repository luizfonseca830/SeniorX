/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Atracao entity.
 */
@CommandDescription(name="retrieveAtracao", kind=CommandKind.Retrieve, requestPrimitive="retrieveAtracao", responsePrimitive="retrieveAtracaoResponse")
public interface RetrieveAtracao extends MessageHandler {
    
    public Atracao retrieveAtracao(Atracao.GetRequest id);
    
}
