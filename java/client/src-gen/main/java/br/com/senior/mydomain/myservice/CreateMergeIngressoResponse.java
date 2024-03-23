/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for createMergeIngresso
 */
@CommandDescription(name="createMergeIngressoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeIngressoResponse")
public interface CreateMergeIngressoResponse extends MessageHandler {

	void createMergeIngressoResponse(Ingresso response);
	
	void createMergeIngressoResponseError(ErrorPayload error);

}
