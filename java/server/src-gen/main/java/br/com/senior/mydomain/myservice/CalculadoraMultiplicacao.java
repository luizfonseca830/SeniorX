/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Realiza a operação matematica de multiplicação
 */
@CommandDescription(name="calculadoraMultiplicacao", kind=CommandKind.Query, requestPrimitive="calculadoraMultiplicacao", responsePrimitive="calculadoraMultiplicacaoResponse")
public interface CalculadoraMultiplicacao extends MessageHandler {
    
    public FieldResultadoCalculadora calculadoraMultiplicacao(FieldCalculadora request);
    
}
