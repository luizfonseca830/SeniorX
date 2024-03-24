/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listAtracao
 */
@CommandDescription(name="listAtracaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listAtracaoResponse")
public interface ListAtracaoResponse extends MessageHandler {

	void listAtracaoResponse(Atracao.PagedResults response);
	
	void listAtracaoResponseError(ErrorPayload error);

}
