/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="getAtracaoByNomeEvento", kind=CommandKind.Query, requestPrimitive="getAtracaoByNomeEvento", responsePrimitive="getAtracaoByNomeEventoResponse")
public interface GetAtracaoByNomeEvento extends MessageHandler {
    
    public GetAtracaoByNomeEventoOutput getAtracaoByNomeEvento(GetAtracaoByNomeEventoInput request);
    
}
