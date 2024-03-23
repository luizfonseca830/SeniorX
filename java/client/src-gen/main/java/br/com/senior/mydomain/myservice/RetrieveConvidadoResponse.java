/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveConvidado
 */
@CommandDescription(name="retrieveConvidadoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveConvidadoResponse")
public interface RetrieveConvidadoResponse extends MessageHandler {

	void retrieveConvidadoResponse(Convidado response);
	
	void retrieveConvidadoResponseError(ErrorPayload error);

}
