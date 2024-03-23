/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listConvidado
 */
@CommandDescription(name="listConvidadoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listConvidadoResponse")
public interface ListConvidadoResponse extends MessageHandler {

	void listConvidadoResponse(Convidado.PagedResults response);
	
	void listConvidadoResponseError(ErrorPayload error);

}
