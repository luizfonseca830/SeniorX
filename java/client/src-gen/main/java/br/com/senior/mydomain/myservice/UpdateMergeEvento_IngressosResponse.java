/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateMergeEvento_Ingressos
 */
@CommandDescription(name="updateMergeEvento_IngressosResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeEvento_IngressosResponse")
public interface UpdateMergeEvento_IngressosResponse extends MessageHandler {

	void updateMergeEvento_IngressosResponse(Ingresso response);
	
	void updateMergeEvento_IngressosResponseError(ErrorPayload error);

}
