package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class CadastrarConvidadoImpl implements CadastrarConvidado{
    @Override
    public RetornoCadastroConvidado cadastrarConvidado(CadastrarConvidadoInput request) {

        final CadastrarConvidadoOutput convidadoOutput = new CadastrarConvidadoOutput();

        final RetornoCadastroConvidado recordCadastroConvidado = new RetornoCadastroConvidado();

        final MensagemRetornoComCodigo recordMensagemComCodigo = new MensagemRetornoComCodigo();
        recordMensagemComCodigo.codigoCadastrado = "1";
        recordMensagemComCodigo.mensagemRetorno = "Convidado Cadastrado !!";
        recordMensagemComCodigo.contemErro = false;

        recordCadastroConvidado.mensagem = recordMensagemComCodigo;
        recordCadastroConvidado.nome = request.nome;
        recordCadastroConvidado.quantidadeAcompanhantes = request.quantidadeAcompanhantes;
        recordCadastroConvidado.nomeSocial = request.nomeSocial;

        return recordCadastroConvidado;
    }
}
