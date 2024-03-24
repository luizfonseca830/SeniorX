/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Atracao entity.
 */
@CommandDescription(name="createAtracao", kind=CommandKind.Create, requestPrimitive="createAtracao", responsePrimitive="createAtracaoResponse")
public interface CreateAtracao extends MessageHandler {
    
    public Atracao createAtracao(Atracao toCreate);
    
}
