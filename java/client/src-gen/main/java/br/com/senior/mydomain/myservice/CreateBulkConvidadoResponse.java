/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createBulkConvidado
 */
@CommandDescription(name="createBulkConvidadoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkConvidadoResponse")
public interface CreateBulkConvidadoResponse extends MessageHandler {

	void createBulkConvidadoResponse(CreateBulkConvidadoOutput response);
	
	void createBulkConvidadoResponseError(ErrorPayload error);

}
