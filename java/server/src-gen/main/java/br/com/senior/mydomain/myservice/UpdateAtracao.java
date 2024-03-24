/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Atracao entity.
 */
@CommandDescription(name="updateAtracao", kind=CommandKind.Update, requestPrimitive="updateAtracao", responsePrimitive="updateAtracaoResponse")
public interface UpdateAtracao extends MessageHandler {
    
    public Atracao updateAtracao(Atracao toUpdate);
    
}
