/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Realiza a operação matematica de adição
 */
@CommandDescription(name="calculadoraAdicao", kind=CommandKind.Query, requestPrimitive="calculadoraAdicao", responsePrimitive="calculadoraAdicaoResponse")
public interface CalculadoraAdicao extends MessageHandler {
    
    public FieldResultadoCalculadora calculadoraAdicao(FieldCalculadora request);
    
}
