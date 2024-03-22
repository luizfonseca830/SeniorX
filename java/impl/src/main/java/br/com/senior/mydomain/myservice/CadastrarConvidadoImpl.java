package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class CadastrarConvidadoImpl implements CadastrarConvidado {
    @Override
    public RetornoCadastroConvidado cadastrarConvidado(FieldCadastroConvidado request) {

        final RetornoCadastroConvidado recordCadastroConvidado = new RetornoCadastroConvidado();

        recordCadastroConvidado.nome = request.nome;
        recordCadastroConvidado.nomeSocial = request.nomeSocial;
        recordCadastroConvidado.resultado = request.resultado;

        return recordCadastroConvidado;
    }
}
