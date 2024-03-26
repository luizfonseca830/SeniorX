/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for findNomeByIdCustom
 */
@CommandDescription(name="findNomeByIdCustomResponse", kind=CommandKind.ResponseCommand, requestPrimitive="findNomeByIdCustomResponse")
public interface FindNomeByIdCustomResponse extends MessageHandler {

	void findNomeByIdCustomResponse(FindNomeByIdCustomOutput response);
	
	void findNomeByIdCustomResponseError(ErrorPayload error);

}
