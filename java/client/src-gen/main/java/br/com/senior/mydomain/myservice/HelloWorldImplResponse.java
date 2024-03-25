/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for helloWorldImpl
 */
@CommandDescription(name="helloWorldImplResponse", kind=CommandKind.ResponseCommand, requestPrimitive="helloWorldImplResponse")
public interface HelloWorldImplResponse extends MessageHandler {

	void helloWorldImplResponse(HelloWorldImplOutput response);
	
	void helloWorldImplResponseError(ErrorPayload error);

}
