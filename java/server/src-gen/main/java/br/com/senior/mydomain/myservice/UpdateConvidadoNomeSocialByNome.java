/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="updateConvidadoNomeSocialByNome", kind=CommandKind.Action, requestPrimitive="updateConvidadoNomeSocialByNome", responsePrimitive="updateConvidadoNomeSocialByNomeResponse")
public interface UpdateConvidadoNomeSocialByNome extends MessageHandler {
    
    public UpdateConvidadoNomeSocialByNomeOutput updateConvidadoNomeSocialByNome(UpdateConvidadoNomeSocialByNomeInput request);
    
}
