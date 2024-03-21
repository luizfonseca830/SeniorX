/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for getMetadata
 */
@CommandDescription(name="getMetadataResponse", kind=CommandKind.ResponseCommand, requestPrimitive="getMetadataResponse")
public interface GetMetadataResponse extends MessageHandler {

	void getMetadataResponse(GetMetadataOutput response);
	
	void getMetadataResponseError(ErrorPayload error);

}
