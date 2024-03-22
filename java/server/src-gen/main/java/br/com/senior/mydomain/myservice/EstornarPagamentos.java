/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="estornarPagamentos", kind=CommandKind.InboundSignal, requestPrimitive="estornarPagamentos", responsePrimitive="")
public interface EstornarPagamentos extends MessageHandler {
    
    public void estornarPagamentos(EstornarPagamentosInput payload);
    
}
