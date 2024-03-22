/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="cancelarEvento", kind=CommandKind.InboundSignal, requestPrimitive="cancelarEvento", responsePrimitive="")
public interface CancelarEvento extends MessageHandler {
    
    public void cancelarEvento(CancelarEventoInput payload);
    
}
