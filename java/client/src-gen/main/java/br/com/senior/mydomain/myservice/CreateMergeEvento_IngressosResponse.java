/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergeEvento_Ingressos
 */
@CommandDescription(name="createMergeEvento_IngressosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeEvento_IngressosResponse")
public interface CreateMergeEvento_IngressosResponse extends MessageHandler {

	void createMergeEvento_IngressosResponse(Ingresso response);
	
	void createMergeEvento_IngressosResponseError(ErrorPayload error);

}
