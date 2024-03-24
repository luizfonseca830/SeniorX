/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Atracao entity.
 */
@CommandDescription(name="updateMergeAtracao", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeAtracao", responsePrimitive="updateMergeAtracaoResponse")
public interface UpdateMergeAtracao extends MessageHandler {
    
    public Atracao updateMergeAtracao(Atracao toUpdateMerge);
    
}
