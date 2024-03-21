package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.HandlerImpl;

import java.time.format.DateTimeFormatter;

@HandlerImpl
public class CadastrarEventoImpl implements CadastrarEvento {
    @Override
    public CadastrarEventoOutput cadastrarEvento(CadastrarEventoInput request) {
        CadastrarEventoOutput cadastrarEventoOutput = new CadastrarEventoOutput();
        String formattedDate = request.data.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
        String resposta = request.apenasColaboradores ? "sim" : "não";
    /*    if (request.apenasColaboradores != null) {
            resposta = request.apenasColaboradores ? "sim" : "não";
        } else {
            resposta = "não";
        }*/
        cadastrarEventoOutput.retorno = String.format("Evento cadastrado! Nome: %s, apenasColaboradores: %s, Limite de pessoas: %d, data: %s",
                request.nome, resposta, request.lotacaoMaxima, formattedDate);
        return cadastrarEventoOutput;
    }
}
