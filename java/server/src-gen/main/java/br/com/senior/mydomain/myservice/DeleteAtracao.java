/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Atracao entity.
 */
@CommandDescription(name="deleteAtracao", kind=CommandKind.Delete, requestPrimitive="deleteAtracao", responsePrimitive="deleteAtracaoResponse")
public interface DeleteAtracao extends MessageHandler {
    
    public void deleteAtracao(Atracao.Id id);
    
}
