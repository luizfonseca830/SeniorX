/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Ingresso entity.
 */
@CommandDescription(name="listIngresso", kind=CommandKind.List, requestPrimitive="listIngresso", responsePrimitive="listIngressoResponse")
public interface ListIngresso extends MessageHandler {
    
    public Ingresso.PagedResults listIngresso(Ingresso.PageRequest pageRequest);
    
}
