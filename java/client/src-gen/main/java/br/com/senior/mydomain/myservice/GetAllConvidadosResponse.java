/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for getAllConvidados
 */
@CommandDescription(name="getAllConvidadosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="getAllConvidadosResponse")
public interface GetAllConvidadosResponse extends MessageHandler {

	void getAllConvidadosResponse(GetAllConvidadosOutput response);
	
	void getAllConvidadosResponseError(ErrorPayload error);

}
