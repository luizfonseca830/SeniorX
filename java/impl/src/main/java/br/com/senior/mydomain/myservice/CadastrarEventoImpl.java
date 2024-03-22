package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.HandlerImpl;

import java.time.format.DateTimeFormatter;

@HandlerImpl
public class CadastrarEventoImpl implements CadastrarEvento {
    @Override
    public CadastrarEventoOutput cadastrarEvento(CadastrarEventoInput request) {

        final CadastrarEventoOutput cadastrarEventoOutput = new CadastrarEventoOutput();

        final RetornoCadastrarEvento recordCadastrarEvento = new RetornoCadastrarEvento();

        final MensagemRetornoComCodigo recordMensagemComCodigo = new MensagemRetornoComCodigo();
        recordMensagemComCodigo.codigoCadastrado = "1";
        recordMensagemComCodigo.mensagemRetorno = "Evento cadastrado !";
        recordMensagemComCodigo.contemErro = false;

        recordCadastrarEvento.mensagem = recordMensagemComCodigo;
        recordCadastrarEvento.nome = request.nome;
        recordCadastrarEvento.apenasColaboradores = request.apenasColaboradores;
        recordCadastrarEvento.lotacaoMaxima = request.lotacaoMaxima;
        recordCadastrarEvento.data = request.data;
        recordCadastrarEvento.tipoEntradaEvento = request.tipoEntradaEvento;

        cadastrarEventoOutput.retorno = recordCadastrarEvento;
        return cadastrarEventoOutput;
    }
}
