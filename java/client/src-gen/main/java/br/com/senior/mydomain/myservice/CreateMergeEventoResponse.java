/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergeEvento
 */
@CommandDescription(name="createMergeEventoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeEventoResponse")
public interface CreateMergeEventoResponse extends MessageHandler {

	void createMergeEventoResponse(Evento response);
	
	void createMergeEventoResponseError(ErrorPayload error);

}
