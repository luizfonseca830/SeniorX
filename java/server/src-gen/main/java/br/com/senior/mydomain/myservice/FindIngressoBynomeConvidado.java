/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="findIngressoBynomeConvidado", kind=CommandKind.Query, requestPrimitive="findIngressoBynomeConvidado", responsePrimitive="findIngressoBynomeConvidadoResponse")
public interface FindIngressoBynomeConvidado extends MessageHandler {
    
    public FindIngressoBynomeConvidadoOutput findIngressoBynomeConvidado(FindIngressoBynomeConvidadoInput request);
    
}
