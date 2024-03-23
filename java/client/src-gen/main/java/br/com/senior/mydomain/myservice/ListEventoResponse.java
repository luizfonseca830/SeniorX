/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listEvento
 */
@CommandDescription(name="listEventoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listEventoResponse")
public interface ListEventoResponse extends MessageHandler {

	void listEventoResponse(Evento.PagedResults response);
	
	void listEventoResponseError(ErrorPayload error);

}
