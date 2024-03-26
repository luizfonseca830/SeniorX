/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="getIdsByNomeConvidado", kind=CommandKind.Query, requestPrimitive="getIdsByNomeConvidado", responsePrimitive="getIdsByNomeConvidadoResponse")
public interface GetIdsByNomeConvidado extends MessageHandler {
    
    public GetIdsByNomeConvidadoOutput getIdsByNomeConvidado(GetIdsByNomeConvidadoInput request);
    
}
