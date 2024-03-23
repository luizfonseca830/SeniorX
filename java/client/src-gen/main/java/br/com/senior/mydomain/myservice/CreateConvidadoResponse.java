/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createConvidado
 */
@CommandDescription(name="createConvidadoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createConvidadoResponse")
public interface CreateConvidadoResponse extends MessageHandler {

	void createConvidadoResponse(Convidado response);
	
	void createConvidadoResponseError(ErrorPayload error);

}
