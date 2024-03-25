/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for calculadoraDivisao
 */
@CommandDescription(name="calculadoraDivisaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="calculadoraDivisaoResponse")
public interface CalculadoraDivisaoResponse extends MessageHandler {

	void calculadoraDivisaoResponse(FieldResultadoCalculadora response);
	
	void calculadoraDivisaoResponseError(ErrorPayload error);

}
