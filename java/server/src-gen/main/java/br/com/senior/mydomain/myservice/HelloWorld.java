/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * 
 * Primitiva que retorna uma mensagem de olá com o nome do requisitante
 * Normalmente no campo who é informado seu próprio nome
 * 
 */
@CommandDescription(name="helloWorld", kind=CommandKind.Query, requestPrimitive="helloWorld", responsePrimitive="helloWorldResponse")
public interface HelloWorld extends MessageHandler {
    
    public HelloWorldOutput helloWorld(HelloWorldInput request);
    
}
