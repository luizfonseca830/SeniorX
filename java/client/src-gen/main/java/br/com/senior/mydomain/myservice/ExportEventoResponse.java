/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for exportEvento
 */
@CommandDescription(name="exportEventoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportEventoResponse")
public interface ExportEventoResponse extends MessageHandler {

	void exportEventoResponse(ExportEventoOutput response);
	
	void exportEventoResponseError(ErrorPayload error);

}
