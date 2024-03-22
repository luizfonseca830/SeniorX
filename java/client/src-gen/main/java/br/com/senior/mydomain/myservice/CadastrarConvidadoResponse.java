/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for cadastrarConvidado
 */
@CommandDescription(name="cadastrarConvidadoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="cadastrarConvidadoResponse")
public interface CadastrarConvidadoResponse extends MessageHandler {

	void cadastrarConvidadoResponse(CadastrarConvidadoOutput response);
	
	void cadastrarConvidadoResponseError(ErrorPayload error);

}
