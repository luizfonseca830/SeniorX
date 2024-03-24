/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportAtracao", kind=CommandKind.Query, requestPrimitive="exportAtracao", responsePrimitive="exportAtracaoResponse")
public interface ExportAtracao extends MessageHandler {
    
    public ExportAtracaoOutput exportAtracao(ExportAtracaoInput request);
    
}
