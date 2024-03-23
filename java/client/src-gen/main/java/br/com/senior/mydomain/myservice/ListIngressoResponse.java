/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listIngresso
 */
@CommandDescription(name="listIngressoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listIngressoResponse")
public interface ListIngressoResponse extends MessageHandler {

	void listIngressoResponse(Ingresso.PagedResults response);
	
	void listIngressoResponseError(ErrorPayload error);

}
