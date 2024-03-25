/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Realiza a operação matematica de subtração
 */
@CommandDescription(name="calculadoraSubtracao", kind=CommandKind.Query, requestPrimitive="calculadoraSubtracao", responsePrimitive="calculadoraSubtracaoResponse")
public interface CalculadoraSubtracao extends MessageHandler {
    
    public FieldResultadoCalculadora calculadoraSubtracao(FieldCalculadora request);
    
}
