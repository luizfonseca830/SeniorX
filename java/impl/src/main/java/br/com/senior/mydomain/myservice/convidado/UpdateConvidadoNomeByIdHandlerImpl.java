package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.*;

import javax.inject.Inject;

@HandlerImpl
public class UpdateConvidadoNomeByIdHandlerImpl implements UpdateConvidadoNomeById {
    @Inject
    private ConvidadoService convidadoService;
    @Override
    public UpdateConvidadoNomeByIdOutput updateConvidadoNomeById(UpdateConvidadoNomeByIdInput request) {
        final ConvidadoEntity convidado = convidadoService.updateNomeById(request.nome, request.id);

        final UpdateConvidadoNomeByIdOutput output = new UpdateConvidadoNomeByIdOutput();
        output.id = convidado.getId().toString();
        output.nome = convidado.getNome();

        return output;
    }
}
