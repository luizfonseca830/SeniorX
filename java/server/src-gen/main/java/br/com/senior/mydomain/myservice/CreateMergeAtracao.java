/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Atracao entity.
 */
@CommandDescription(name="createMergeAtracao", kind=CommandKind.CreateMerge, requestPrimitive="createMergeAtracao", responsePrimitive="createMergeAtracaoResponse")
public interface CreateMergeAtracao extends MessageHandler {
    
    public Atracao createMergeAtracao(Atracao toCreateMerge);
    
}
