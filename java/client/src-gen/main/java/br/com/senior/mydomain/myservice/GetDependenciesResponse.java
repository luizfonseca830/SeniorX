/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for getDependencies
 */
@CommandDescription(name="getDependenciesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="getDependenciesResponse")
public interface GetDependenciesResponse extends MessageHandler {

	void getDependenciesResponse(GetDependenciesOutput response);
	
	void getDependenciesResponseError(ErrorPayload error);

}
