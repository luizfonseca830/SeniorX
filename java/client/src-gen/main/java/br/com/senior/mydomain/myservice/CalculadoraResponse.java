/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for calculadora
 */
@CommandDescription(name="calculadoraResponse", kind=CommandKind.ResponseCommand, requestPrimitive="calculadoraResponse")
public interface CalculadoraResponse extends MessageHandler {

	void calculadoraResponse(CalculadoraOutput response);
	
	void calculadoraResponseError(ErrorPayload error);

}
