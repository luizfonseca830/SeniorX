/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Convidado entity.
 */
@CommandDescription(name="updateMergeConvidado", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeConvidado", responsePrimitive="updateMergeConvidadoResponse")
public interface UpdateMergeConvidado extends MessageHandler {
    
    public Convidado updateMergeConvidado(Convidado toUpdateMerge);
    
}
