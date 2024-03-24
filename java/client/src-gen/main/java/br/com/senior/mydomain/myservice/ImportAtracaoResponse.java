/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for importAtracao
 */
@CommandDescription(name="importAtracaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importAtracaoResponse")
public interface ImportAtracaoResponse extends MessageHandler {

	void importAtracaoResponse(ImportAtracaoOutput response);
	
	void importAtracaoResponseError(ErrorPayload error);

}
