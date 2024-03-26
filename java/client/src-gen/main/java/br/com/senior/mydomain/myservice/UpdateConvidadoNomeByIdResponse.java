/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateConvidadoNomeById
 */
@CommandDescription(name="updateConvidadoNomeByIdResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateConvidadoNomeByIdResponse")
public interface UpdateConvidadoNomeByIdResponse extends MessageHandler {

	void updateConvidadoNomeByIdResponse(UpdateConvidadoNomeByIdOutput response);
	
	void updateConvidadoNomeByIdResponseError(ErrorPayload error);

}
