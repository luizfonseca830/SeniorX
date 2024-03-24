/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergeAtracao
 */
@CommandDescription(name="createMergeAtracaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeAtracaoResponse")
public interface CreateMergeAtracaoResponse extends MessageHandler {

	void createMergeAtracaoResponse(Atracao response);
	
	void createMergeAtracaoResponseError(ErrorPayload error);

}
