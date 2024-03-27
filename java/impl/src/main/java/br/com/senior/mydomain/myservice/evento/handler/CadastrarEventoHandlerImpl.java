package br.com.senior.mydomain.myservice.evento.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.CadastrarEvento;
import br.com.senior.mydomain.myservice.CadastrarEventoInput;
import br.com.senior.mydomain.myservice.RetornoCadastrarEvento;

@HandlerImpl
public class CadastrarEventoHandlerImpl implements CadastrarEvento {
    @Override
    public RetornoCadastrarEvento cadastrarEvento(CadastrarEventoInput request) {

        final RetornoCadastrarEvento recordCadastrarEvento = new RetornoCadastrarEvento();

        recordCadastrarEvento.nome = request.nome;
        recordCadastrarEvento.apenasColaboradores = request.apenasColaboradores;
        recordCadastrarEvento.lotacaoMaxima = request.lotacaoMaxima;
        recordCadastrarEvento.data = request.data;
        recordCadastrarEvento.tipoEntradaEvento = request.tipoEntradaEvento;
        recordCadastrarEvento.codigoCadastrado = "1";
        recordCadastrarEvento.mensagemRetorno = "Evento cadastrado com sucesso !!";
        recordCadastrarEvento.contemErro = false;

        return recordCadastrarEvento;
    }
}
