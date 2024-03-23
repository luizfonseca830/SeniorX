/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createIngresso
 */
@CommandDescription(name="createIngressoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createIngressoResponse")
public interface CreateIngressoResponse extends MessageHandler {

	void createIngressoResponse(Ingresso response);
	
	void createIngressoResponseError(ErrorPayload error);

}
