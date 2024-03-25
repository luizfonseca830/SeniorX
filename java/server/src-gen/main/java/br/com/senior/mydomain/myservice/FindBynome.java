/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="findBynome", kind=CommandKind.Query, requestPrimitive="findBynome", responsePrimitive="findBynomeResponse")
public interface FindBynome extends MessageHandler {
    
    public FindBynomeOutput findBynome(FindBynomeInput request);
    
}
