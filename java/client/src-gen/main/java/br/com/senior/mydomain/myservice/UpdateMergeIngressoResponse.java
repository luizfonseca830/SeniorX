/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for updateMergeIngresso
 */
@CommandDescription(name="updateMergeIngressoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeIngressoResponse")
public interface UpdateMergeIngressoResponse extends MessageHandler {

	void updateMergeIngressoResponse(Ingresso response);
	
	void updateMergeIngressoResponseError(ErrorPayload error);

}
