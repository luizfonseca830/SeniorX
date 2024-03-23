/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createBulkEvento
 */
@CommandDescription(name="createBulkEventoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkEventoResponse")
public interface CreateBulkEventoResponse extends MessageHandler {

	void createBulkEventoResponse(CreateBulkEventoOutput response);
	
	void createBulkEventoResponseError(ErrorPayload error);

}
