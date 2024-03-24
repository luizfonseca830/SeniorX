/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveAtracao
 */
@CommandDescription(name="retrieveAtracaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveAtracaoResponse")
public interface RetrieveAtracaoResponse extends MessageHandler {

	void retrieveAtracaoResponse(Atracao response);
	
	void retrieveAtracaoResponseError(ErrorPayload error);

}
