/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="getConvidadosByCpf", kind=CommandKind.Query, requestPrimitive="getConvidadosByCpf", responsePrimitive="getConvidadosByCpfResponse")
public interface GetConvidadosByCpf extends MessageHandler {
    
    public GetConvidadosByCpfOutput getConvidadosByCpf(GetConvidadosByCpfInput request);
    
}
