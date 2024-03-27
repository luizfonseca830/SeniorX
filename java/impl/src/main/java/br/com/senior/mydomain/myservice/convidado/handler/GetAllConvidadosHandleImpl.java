package br.com.senior.mydomain.myservice.convidado.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.ConvidadoEntity;
import br.com.senior.mydomain.myservice.GetAllConvidados;
import br.com.senior.mydomain.myservice.GetAllConvidadosInput;
import br.com.senior.mydomain.myservice.GetAllConvidadosOutput;
import br.com.senior.mydomain.myservice.convidado.ConvidadoService;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@HandlerImpl
public class GetAllConvidadosHandleImpl implements GetAllConvidados {

    @Inject
    private ConvidadoService convidadoService;
    @Override
    public GetAllConvidadosOutput getAllConvidados(GetAllConvidadosInput request) {
        List<UUID> idConvidados = convidadoService.getAll();
        List<String> ids = idConvidados.stream().map(id -> id.toString()).collect(Collectors.toList());
        return new GetAllConvidadosOutput(ids);
    }
}
