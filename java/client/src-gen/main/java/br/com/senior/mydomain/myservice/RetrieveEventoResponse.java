/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveEvento
 */
@CommandDescription(name="retrieveEventoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveEventoResponse")
public interface RetrieveEventoResponse extends MessageHandler {

	void retrieveEventoResponse(Evento response);
	
	void retrieveEventoResponseError(ErrorPayload error);

}
