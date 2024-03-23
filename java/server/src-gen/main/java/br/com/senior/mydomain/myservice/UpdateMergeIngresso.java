/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Ingresso entity.
 */
@CommandDescription(name="updateMergeIngresso", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeIngresso", responsePrimitive="updateMergeIngressoResponse")
public interface UpdateMergeIngresso extends MessageHandler {
    
    public Ingresso updateMergeIngresso(Ingresso toUpdateMerge);
    
}
