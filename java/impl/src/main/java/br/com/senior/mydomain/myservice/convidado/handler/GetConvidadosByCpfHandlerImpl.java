package br.com.senior.mydomain.myservice.convidado.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.convidado.ConvidadoService;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@HandlerImpl
public class GetConvidadosByCpfHandlerImpl implements GetConvidadosByCpf {
    @Inject
    ConvidadoService convidadoService;

    @Override
    public GetConvidadosByCpfOutput getConvidadosByCpf(GetConvidadosByCpfInput request) {
        final List<ConvidadoEntity > cpfConvidado = convidadoService.getConvidadosByCpf(request.cpf);
        final List<String> convidados = cpfConvidado.stream()
                .map(convidado -> convidado.getNome() + "(" + convidado.getNomeSocial() + ")")
                .collect(Collectors.toList());
        return new GetConvidadosByCpfOutput(convidados);
    }
}
