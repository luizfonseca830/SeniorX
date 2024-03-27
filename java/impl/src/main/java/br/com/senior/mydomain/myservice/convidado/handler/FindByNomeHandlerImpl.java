package br.com.senior.mydomain.myservice.convidado.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.convidado.ConvidadoConverter;
import br.com.senior.mydomain.myservice.convidado.ConvidadoService;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@HandlerImpl
public class FindByNomeHandlerImpl implements FindBynome {
    @Inject
    private ConvidadoService convidadoService;

    @Inject
    private ConvidadoConverter convidadoConverter;

    @Override
    public FindBynomeOutput findBynome(FindBynomeInput request) {
        final List<ConvidadoEntity> convidados = convidadoService.findByNomeWithQuery(request.nome);

        return new FindBynomeOutput(convidados
                .stream()
                .map(c -> convidadoConverter.toConvidado(c))
                .collect(Collectors.toList()));
    }
}
