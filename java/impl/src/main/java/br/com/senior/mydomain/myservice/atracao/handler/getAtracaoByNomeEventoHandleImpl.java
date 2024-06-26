package br.com.senior.mydomain.myservice.atracao.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.GetAtracaoByNomeEvento;
import br.com.senior.mydomain.myservice.GetAtracaoByNomeEventoInput;
import br.com.senior.mydomain.myservice.GetAtracaoByNomeEventoOutput;
import br.com.senior.mydomain.myservice.atracao.AtracaoService;

import javax.inject.Inject;

@HandlerImpl
public class getAtracaoByNomeEventoHandleImpl implements GetAtracaoByNomeEvento {

    @Inject
    AtracaoService atracaoService;
    @Override
    public GetAtracaoByNomeEventoOutput getAtracaoByNomeEvento(GetAtracaoByNomeEventoInput request) {
        return new GetAtracaoByNomeEventoOutput(atracaoService.getAtracaoByNomeEvento(request.nomeEvento));
    }
}
