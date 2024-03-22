package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class CadastrarConvidadoImpl implements CadastrarConvidado {
    @Override
    public RetornoCadastroConvidado cadastrarConvidado(CadastrarConvidadoInput request) {

        final RetornoCadastroConvidado recordCadastroConvidado = new RetornoCadastroConvidado();

        recordCadastroConvidado.nome = request.nome;
        recordCadastroConvidado.quantidadeAcompanhantes = request.quantidadeAcompanhantes;
        recordCadastroConvidado.nomeSocial = request.nomeSocial;
        recordCadastroConvidado.codigoCadastrado = "1";
        recordCadastroConvidado.mensagemRetorno = "Convidado cadastrado com sucesso !!";
        recordCadastroConvidado.contemErro = false;

        return recordCadastroConvidado;
    }
}
