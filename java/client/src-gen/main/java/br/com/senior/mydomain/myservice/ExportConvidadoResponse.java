/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for exportConvidado
 */
@CommandDescription(name="exportConvidadoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportConvidadoResponse")
public interface ExportConvidadoResponse extends MessageHandler {

	void exportConvidadoResponse(ExportConvidadoOutput response);
	
	void exportConvidadoResponseError(ErrorPayload error);

}
