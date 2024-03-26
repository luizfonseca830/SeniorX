/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for getAtracaoByNomeEvento
 */
@CommandDescription(name="getAtracaoByNomeEventoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="getAtracaoByNomeEventoResponse")
public interface GetAtracaoByNomeEventoResponse extends MessageHandler {

	void getAtracaoByNomeEventoResponse(GetAtracaoByNomeEventoOutput response);
	
	void getAtracaoByNomeEventoResponseError(ErrorPayload error);

}
