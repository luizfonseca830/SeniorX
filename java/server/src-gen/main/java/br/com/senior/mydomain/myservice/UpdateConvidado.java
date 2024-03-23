/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Convidado entity.
 */
@CommandDescription(name="updateConvidado", kind=CommandKind.Update, requestPrimitive="updateConvidado", responsePrimitive="updateConvidadoResponse")
public interface UpdateConvidado extends MessageHandler {
    
    public Convidado updateConvidado(Convidado toUpdate);
    
}
