/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findBynome
 */
@CommandDescription(name="findBynomeResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findBynomeResponse")
public interface FindBynomeResponse extends MessageHandler {

	void findBynomeResponse(FindBynomeOutput response);
	
	void findBynomeResponseError(ErrorPayload error);

}
