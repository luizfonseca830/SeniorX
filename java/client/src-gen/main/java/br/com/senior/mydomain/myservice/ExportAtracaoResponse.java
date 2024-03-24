/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for exportAtracao
 */
@CommandDescription(name="exportAtracaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportAtracaoResponse")
public interface ExportAtracaoResponse extends MessageHandler {

	void exportAtracaoResponse(ExportAtracaoOutput response);
	
	void exportAtracaoResponseError(ErrorPayload error);

}
