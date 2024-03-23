/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for importConvidado
 */
@CommandDescription(name="importConvidadoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importConvidadoResponse")
public interface ImportConvidadoResponse extends MessageHandler {

	void importConvidadoResponse(ImportConvidadoOutput response);
	
	void importConvidadoResponseError(ErrorPayload error);

}
