/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for importEvento
 */
@CommandDescription(name="importEventoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importEventoResponse")
public interface ImportEventoResponse extends MessageHandler {

	void importEventoResponse(ImportEventoOutput response);
	
	void importEventoResponseError(ErrorPayload error);

}
