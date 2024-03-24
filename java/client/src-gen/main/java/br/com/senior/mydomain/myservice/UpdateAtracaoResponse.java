/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateAtracao
 */
@CommandDescription(name="updateAtracaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateAtracaoResponse")
public interface UpdateAtracaoResponse extends MessageHandler {

	void updateAtracaoResponse(Atracao response);
	
	void updateAtracaoResponseError(ErrorPayload error);

}
