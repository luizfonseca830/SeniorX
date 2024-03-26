/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="updateConvidadoNomeById", kind=CommandKind.Action, requestPrimitive="updateConvidadoNomeById", responsePrimitive="updateConvidadoNomeByIdResponse")
public interface UpdateConvidadoNomeById extends MessageHandler {
    
    public UpdateConvidadoNomeByIdOutput updateConvidadoNomeById(UpdateConvidadoNomeByIdInput request);
    
}
