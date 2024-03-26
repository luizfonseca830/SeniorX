/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="getAllConvidados", kind=CommandKind.Query, requestPrimitive="getAllConvidados", responsePrimitive="getAllConvidadosResponse")
public interface GetAllConvidados extends MessageHandler {
    
    public GetAllConvidadosOutput getAllConvidados(GetAllConvidadosInput request);
    
}
