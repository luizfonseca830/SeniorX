/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Cadastrar um novo convidado e acompanhantes
 */
@CommandDescription(name="cadastrarConvidado", kind=CommandKind.Action, requestPrimitive="cadastrarConvidado", responsePrimitive="cadastrarConvidadoResponse")
public interface CadastrarConvidado extends MessageHandler {
    
    public RetornoCadastroConvidado cadastrarConvidado(CadastrarConvidadoInput request);
    
}
