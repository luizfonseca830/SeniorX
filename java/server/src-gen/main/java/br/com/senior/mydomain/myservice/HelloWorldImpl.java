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
@CommandDescription(name="helloWorldImpl", kind=CommandKind.Query, requestPrimitive="helloWorldImpl", responsePrimitive="helloWorldImplResponse")
public interface HelloWorldImpl extends MessageHandler {
    
    public HelloWorldImplOutput helloWorldImpl(HelloWorldImplInput request);
    
}
