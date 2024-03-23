/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Ingresso entity.
 */
@CommandDescription(name="deleteIngresso", kind=CommandKind.Delete, requestPrimitive="deleteIngresso", responsePrimitive="deleteIngressoResponse")
public interface DeleteIngresso extends MessageHandler {
    
    public void deleteIngresso(Ingresso.Id id);
    
}
