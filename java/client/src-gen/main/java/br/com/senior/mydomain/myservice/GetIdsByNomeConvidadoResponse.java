/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for getIdsByNomeConvidado
 */
@CommandDescription(name="getIdsByNomeConvidadoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="getIdsByNomeConvidadoResponse")
public interface GetIdsByNomeConvidadoResponse extends MessageHandler {

	void getIdsByNomeConvidadoResponse(GetIdsByNomeConvidadoOutput response);
	
	void getIdsByNomeConvidadoResponseError(ErrorPayload error);

}
