/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Ingresso entity.
 */
@CommandDescription(name="updateIngresso", kind=CommandKind.Update, requestPrimitive="updateIngresso", responsePrimitive="updateIngressoResponse")
public interface UpdateIngresso extends MessageHandler {
    
    public Ingresso updateIngresso(Ingresso toUpdate);
    
}
