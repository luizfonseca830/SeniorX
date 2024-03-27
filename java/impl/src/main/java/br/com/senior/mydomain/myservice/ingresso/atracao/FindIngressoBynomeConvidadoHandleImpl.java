package br.com.senior.mydomain.myservice.ingresso.atracao;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.ingresso.IngressoService;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@HandlerImpl
public class FindIngressoBynomeConvidadoHandleImpl implements FindIngressoBynomeConvidado {
    @Inject
    IngressoService ingressoService;
    @Override
    public FindIngressoBynomeConvidadoOutput findIngressoBynomeConvidado(FindIngressoBynomeConvidadoInput request) {
        final List<IngressoEntity> ingressos =  ingressoService.findByNomeConvidado(request.nomeConvidado);
        final List<Ingresso> ingressosDTO = ingressos.stream()
                .map(i -> new Ingresso(i.getId().toString(), i.getDataHora(), null, i.getQuantidadeAcompanhantes(), null, null))
                .collect(Collectors.toList());
        return new FindIngressoBynomeConvidadoOutput(ingressosDTO);
    }
}
