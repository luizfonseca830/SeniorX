package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class CadastrarConvidadoImpl implements CadastrarConvidado{
    @Override
    public CadastrarConvidadoOutput cadastrarConvidado(CadastrarConvidadoInput request) {
        final MensagemRetornoComCodigo recordMensagemComCodigo = new MensagemRetornoComCodigo();
        recordMensagemComCodigo.codigoCadastrado = "1";
        recordMensagemComCodigo.mensagemRetorno = "Convidado Cadastrado !!";
        recordMensagemComCodigo.contemErro = false;
        final CadastrarConvidadoOutput convidadoOutput = new CadastrarConvidadoOutput();
        convidadoOutput.mensagem = recordMensagemComCodigo;
        convidadoOutput.convidado = String.format("Nome: %s, com %s acompanhantes mais conhecido como %s",
                request.nome, request.quantidadeAcompanhantes, request.nomeSocial);
        return convidadoOutput;
    }
}
