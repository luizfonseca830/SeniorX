/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Realiza a operação matematica de divisão
 */
@CommandDescription(name="calculadoraDivisao", kind=CommandKind.Query, requestPrimitive="calculadoraDivisao", responsePrimitive="calculadoraDivisaoResponse")
public interface CalculadoraDivisao extends MessageHandler {
    
    public FieldResultadoCalculadora calculadoraDivisao(FieldCalculadora request);
    
}
