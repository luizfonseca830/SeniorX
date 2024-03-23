/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Convidado entity.
 */
@CommandDescription(name="createMergeConvidado", kind=CommandKind.CreateMerge, requestPrimitive="createMergeConvidado", responsePrimitive="createMergeConvidadoResponse")
public interface CreateMergeConvidado extends MessageHandler {
    
    public Convidado createMergeConvidado(Convidado toCreateMerge);
    
}
