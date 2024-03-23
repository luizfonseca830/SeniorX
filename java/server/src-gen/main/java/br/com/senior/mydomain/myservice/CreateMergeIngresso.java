/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Ingresso entity.
 */
@CommandDescription(name="createMergeIngresso", kind=CommandKind.CreateMerge, requestPrimitive="createMergeIngresso", responsePrimitive="createMergeIngressoResponse")
public interface CreateMergeIngresso extends MessageHandler {
    
    public Ingresso createMergeIngresso(Ingresso toCreateMerge);
    
}
