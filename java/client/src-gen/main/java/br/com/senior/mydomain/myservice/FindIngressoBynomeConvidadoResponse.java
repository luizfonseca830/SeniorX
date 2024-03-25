/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findIngressoBynomeConvidado
 */
@CommandDescription(name="findIngressoBynomeConvidadoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findIngressoBynomeConvidadoResponse")
public interface FindIngressoBynomeConvidadoResponse extends MessageHandler {

	void findIngressoBynomeConvidadoResponse(FindIngressoBynomeConvidadoOutput response);
	
	void findIngressoBynomeConvidadoResponseError(ErrorPayload error);

}
