/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createBulkAtracao
 */
@CommandDescription(name="createBulkAtracaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkAtracaoResponse")
public interface CreateBulkAtracaoResponse extends MessageHandler {

	void createBulkAtracaoResponse(CreateBulkAtracaoOutput response);
	
	void createBulkAtracaoResponseError(ErrorPayload error);

}
