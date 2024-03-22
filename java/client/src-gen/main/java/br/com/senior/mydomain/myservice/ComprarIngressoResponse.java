/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for comprarIngresso
 */
@CommandDescription(name="comprarIngressoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="comprarIngressoResponse")
public interface ComprarIngressoResponse extends MessageHandler {

	void comprarIngressoResponse(ComprarIngressoOutput response);
	
	void comprarIngressoResponseError(ErrorPayload error);

}
