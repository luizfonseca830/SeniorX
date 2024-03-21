/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Returns a list with all dependencies from this service, along with their respective versions
 */
@CommandDescription(name="getDependencies", kind=CommandKind.Query, requestPrimitive="getDependencies", responsePrimitive="getDependenciesResponse")
public interface GetDependencies extends MessageHandler {
    
    public GetDependenciesOutput getDependencies();
    
}
