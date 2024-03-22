/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="comprarIngresso", kind=CommandKind.Action, requestPrimitive="comprarIngresso", responsePrimitive="comprarIngressoResponse")
public interface ComprarIngresso extends MessageHandler {
    
    public ComprarIngressoOutput comprarIngresso(ComprarIngressoInput request);
    
}
