/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="findNomeByIdCustom", kind=CommandKind.Query, requestPrimitive="findNomeByIdCustom", responsePrimitive="findNomeByIdCustomResponse")
public interface FindNomeByIdCustom extends MessageHandler {
    
    public FindNomeByIdCustomOutput findNomeByIdCustom(FindNomeByIdCustomInput request);
    
}
