/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergeConvidado
 */
@CommandDescription(name="createMergeConvidadoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeConvidadoResponse")
public interface CreateMergeConvidadoResponse extends MessageHandler {

	void createMergeConvidadoResponse(Convidado response);
	
	void createMergeConvidadoResponseError(ErrorPayload error);

}
