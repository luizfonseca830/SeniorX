/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateConvidadoNomeSocialByNome
 */
@CommandDescription(name="updateConvidadoNomeSocialByNomeResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateConvidadoNomeSocialByNomeResponse")
public interface UpdateConvidadoNomeSocialByNomeResponse extends MessageHandler {

	void updateConvidadoNomeSocialByNomeResponse(UpdateConvidadoNomeSocialByNomeOutput response);
	
	void updateConvidadoNomeSocialByNomeResponseError(ErrorPayload error);

}
