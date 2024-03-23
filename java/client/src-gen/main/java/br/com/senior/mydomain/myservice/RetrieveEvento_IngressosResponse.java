/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for retrieveEvento_Ingressos
 */
@CommandDescription(name="retrieveEvento_IngressosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveEvento_IngressosResponse")
public interface RetrieveEvento_IngressosResponse extends MessageHandler {

	void retrieveEvento_IngressosResponse(Ingresso response);
	
	void retrieveEvento_IngressosResponseError(ErrorPayload error);

}
