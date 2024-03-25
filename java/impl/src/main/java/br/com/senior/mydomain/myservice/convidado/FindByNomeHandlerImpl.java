package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.*;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@HandlerImpl
public class FindByNomeHandlerImpl implements FindBynome {
    @Inject
    private ConvidadoService convidadoService;

    @Override
    public FindBynomeOutput findBynome(FindBynomeInput request) {
       final List<ConvidadoEntity> convidados = convidadoService.findByNomeContainingIgnoreCase(request.nome);

       final List<Convidado> convudadosDto = convidados
               .stream()
               .map(c -> new Convidado(c.getId().toString(), c.getNome(), c.getNomeSocial(), c.getCpf(), c.getDataNascimneto(), null))
               .collect(Collectors.toList());

       return new FindBynomeOutput(convudadosDto);
    }
}
