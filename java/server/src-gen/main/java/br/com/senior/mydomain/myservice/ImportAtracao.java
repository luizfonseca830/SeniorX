/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importAtracao", kind=CommandKind.Action, requestPrimitive="importAtracao", responsePrimitive="importAtracaoResponse")
public interface ImportAtracao extends MessageHandler {
    
    public ImportAtracaoOutput importAtracao(ImportAtracaoInput request);
    
}
