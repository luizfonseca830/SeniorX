/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for helloWorld
 */
@CommandDescription(name="helloWorldResponse", kind=CommandKind.ResponseCommand, requestPrimitive="helloWorldResponse")
public interface HelloWorldResponse extends MessageHandler {

	void helloWorldResponse(HelloWorldOutput response);
	
	void helloWorldResponseError(ErrorPayload error);

}
