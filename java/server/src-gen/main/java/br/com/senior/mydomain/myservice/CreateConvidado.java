/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Convidado entity.
 */
@CommandDescription(name="createConvidado", kind=CommandKind.Create, requestPrimitive="createConvidado", responsePrimitive="createConvidadoResponse")
public interface CreateConvidado extends MessageHandler {
    
    public Convidado createConvidado(Convidado toCreate);
    
}
