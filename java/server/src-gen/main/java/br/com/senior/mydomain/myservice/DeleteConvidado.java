/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Convidado entity.
 */
@CommandDescription(name="deleteConvidado", kind=CommandKind.Delete, requestPrimitive="deleteConvidado", responsePrimitive="deleteConvidadoResponse")
public interface DeleteConvidado extends MessageHandler {
    
    public void deleteConvidado(Convidado.Id id);
    
}
