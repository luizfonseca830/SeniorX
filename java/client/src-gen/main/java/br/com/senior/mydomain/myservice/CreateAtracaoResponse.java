/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createAtracao
 */
@CommandDescription(name="createAtracaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createAtracaoResponse")
public interface CreateAtracaoResponse extends MessageHandler {

	void createAtracaoResponse(Atracao response);
	
	void createAtracaoResponseError(ErrorPayload error);

}
