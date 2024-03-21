package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class CadastrarConvidadeoImpl implements CadastrarConvidado{
    @Override
    public CadastrarConvidadoOutput cadastrarConvidado(CadastrarConvidadoInput request) {
        CadastrarConvidadoOutput convidadoOutput = new CadastrarConvidadoOutput();
        convidadoOutput.convidado = String.format("Convidado Nome: %s cadastrado com sucesso!!, com %s acompanhantes mais conhecido como %s",
                request.nome, request.quantidadeAcompanhantes, request.nomeSocial);
        return convidadoOutput;
    }
}
