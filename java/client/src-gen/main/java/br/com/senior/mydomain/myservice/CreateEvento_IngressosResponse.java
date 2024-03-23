/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createEvento_Ingressos
 */
@CommandDescription(name="createEvento_IngressosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createEvento_IngressosResponse")
public interface CreateEvento_IngressosResponse extends MessageHandler {

	void createEvento_IngressosResponse(Ingresso response);
	
	void createEvento_IngressosResponseError(ErrorPayload error);

}
