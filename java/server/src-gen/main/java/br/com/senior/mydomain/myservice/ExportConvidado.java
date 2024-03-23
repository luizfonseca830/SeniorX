/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportConvidado", kind=CommandKind.Query, requestPrimitive="exportConvidado", responsePrimitive="exportConvidadoResponse")
public interface ExportConvidado extends MessageHandler {
    
    public ExportConvidadoOutput exportConvidado(ExportConvidadoInput request);
    
}
