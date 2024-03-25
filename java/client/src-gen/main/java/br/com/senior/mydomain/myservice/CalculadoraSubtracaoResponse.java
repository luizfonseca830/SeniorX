/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for calculadoraSubtracao
 */
@CommandDescription(name="calculadoraSubtracaoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="calculadoraSubtracaoResponse")
public interface CalculadoraSubtracaoResponse extends MessageHandler {

	void calculadoraSubtracaoResponse(FieldResultadoCalculadora response);
	
	void calculadoraSubtracaoResponseError(ErrorPayload error);

}
