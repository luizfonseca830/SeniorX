/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Ingresso entity.
 */
@CommandDescription(name="createIngresso", kind=CommandKind.Create, requestPrimitive="createIngresso", responsePrimitive="createIngressoResponse")
public interface CreateIngresso extends MessageHandler {
    
    public Ingresso createIngresso(Ingresso toCreate);
    
}
