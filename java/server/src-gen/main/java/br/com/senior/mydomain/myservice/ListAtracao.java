/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Atracao entity.
 */
@CommandDescription(name="listAtracao", kind=CommandKind.List, requestPrimitive="listAtracao", responsePrimitive="listAtracaoResponse")
public interface ListAtracao extends MessageHandler {
    
    public Atracao.PagedResults listAtracao(Atracao.PageRequest pageRequest);
    
}
