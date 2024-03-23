/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Convidado entity.
 */
@CommandDescription(name="listConvidado", kind=CommandKind.List, requestPrimitive="listConvidado", responsePrimitive="listConvidadoResponse")
public interface ListConvidado extends MessageHandler {
    
    public Convidado.PagedResults listConvidado(Convidado.PageRequest pageRequest);
    
}
