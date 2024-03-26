package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.ConvidadoEntity;
import br.com.senior.mydomain.myservice.UpdateConvidadoNomeSocialByNome;
import br.com.senior.mydomain.myservice.UpdateConvidadoNomeSocialByNomeInput;
import br.com.senior.mydomain.myservice.UpdateConvidadoNomeSocialByNomeOutput;

import javax.inject.Inject;
import java.util.List;

@HandlerImpl
public class updateConvidadoNomeSocialByNomeHandlerImpl implements UpdateConvidadoNomeSocialByNome {
    @Inject
    private ConvidadoService convidadoService;

    @Override
    public UpdateConvidadoNomeSocialByNomeOutput updateConvidadoNomeSocialByNome(UpdateConvidadoNomeSocialByNomeInput request) {
        List<String> ids = convidadoService.updateConvidadoNomeSocialByNome(request.nome, request.nomeSocial);
        return new UpdateConvidadoNomeSocialByNomeOutput(ids);
    }
}
