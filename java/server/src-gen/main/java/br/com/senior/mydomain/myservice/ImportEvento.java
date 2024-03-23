/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importEvento", kind=CommandKind.Action, requestPrimitive="importEvento", responsePrimitive="importEventoResponse")
public interface ImportEvento extends MessageHandler {
    
    public ImportEventoOutput importEvento(ImportEventoInput request);
    
}
