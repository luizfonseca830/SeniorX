/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateIngresso
 */
@CommandDescription(name="updateIngressoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateIngressoResponse")
public interface UpdateIngressoResponse extends MessageHandler {

	void updateIngressoResponse(Ingresso response);
	
	void updateIngressoResponseError(ErrorPayload error);

}
