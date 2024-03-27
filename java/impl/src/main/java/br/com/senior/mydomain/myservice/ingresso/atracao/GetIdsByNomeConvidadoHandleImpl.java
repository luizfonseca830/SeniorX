package br.com.senior.mydomain.myservice.ingresso.atracao;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.GetIdsByNomeConvidado;
import br.com.senior.mydomain.myservice.GetIdsByNomeConvidadoInput;
import br.com.senior.mydomain.myservice.GetIdsByNomeConvidadoOutput;
import br.com.senior.mydomain.myservice.ingresso.IngressoService;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@HandlerImpl
public class GetIdsByNomeConvidadoHandleImpl implements GetIdsByNomeConvidado {
    @Inject
    IngressoService ingressoService;

    @Override
    public GetIdsByNomeConvidadoOutput getIdsByNomeConvidado(GetIdsByNomeConvidadoInput request) {
        final List<UUID> ids = ingressoService.getIdsByNomeConvidado(request.nomeConvidado);
        List<String> idsString = ids.stream().map(id -> id.toString()).collect(Collectors.toList());

        return new GetIdsByNomeConvidadoOutput(idsString);
    }
}
