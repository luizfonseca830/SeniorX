/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkConvidado", kind = CommandKind.Create, requestPrimitive = "createBulkConvidado", responsePrimitive="")
public interface CreateBulkConvidado extends MessageHandler {
    public CreateBulkConvidadoOutput createBulkConvidado(CreateBulkConvidadoInput toCreate);
}
