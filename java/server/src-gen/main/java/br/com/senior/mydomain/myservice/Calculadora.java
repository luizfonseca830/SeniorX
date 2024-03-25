/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="calculadora", kind=CommandKind.Query, requestPrimitive="calculadora", responsePrimitive="calculadoraResponse")
public interface Calculadora extends MessageHandler {
    
    public CalculadoraOutput calculadora(CalculadoraInput request);
    
}
