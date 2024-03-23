/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listEvento_Ingressos
 */
@CommandDescription(name="listEvento_IngressosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listEvento_IngressosResponse")
public interface ListEvento_IngressosResponse extends MessageHandler {

	void listEvento_IngressosResponse(Ingresso.PagedResults response);
	
	void listEvento_IngressosResponseError(ErrorPayload error);

}
