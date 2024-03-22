/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for cadastrarEvento
 */
@CommandDescription(name="cadastrarEventoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="cadastrarEventoResponse")
public interface CadastrarEventoResponse extends MessageHandler {

	void cadastrarEventoResponse(RetornoCadastrarEvento response);
	
	void cadastrarEventoResponseError(ErrorPayload error);

}
