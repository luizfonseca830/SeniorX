/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateEvento_Ingressos
 */
@CommandDescription(name="updateEvento_IngressosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateEvento_IngressosResponse")
public interface UpdateEvento_IngressosResponse extends MessageHandler {

	void updateEvento_IngressosResponse(Ingresso response);
	
	void updateEvento_IngressosResponseError(ErrorPayload error);

}
