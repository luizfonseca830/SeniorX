/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importConvidado", kind=CommandKind.Action, requestPrimitive="importConvidado", responsePrimitive="importConvidadoResponse")
public interface ImportConvidado extends MessageHandler {
    
    public ImportConvidadoOutput importConvidado(ImportConvidadoInput request);
    
}
