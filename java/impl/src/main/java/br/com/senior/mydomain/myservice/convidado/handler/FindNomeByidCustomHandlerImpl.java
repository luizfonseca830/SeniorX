package br.com.senior.mydomain.myservice.convidado.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.FindNomeByIdCustom;
import br.com.senior.mydomain.myservice.FindNomeByIdCustomInput;
import br.com.senior.mydomain.myservice.FindNomeByIdCustomOutput;
import br.com.senior.mydomain.myservice.convidado.ConvidadoService;

import javax.inject.Inject;

@HandlerImpl
public class FindNomeByidCustomHandlerImpl implements FindNomeByIdCustom {

    @Inject
    private ConvidadoService convidadoService;
    @Override
    public FindNomeByIdCustomOutput findNomeByIdCustom(FindNomeByIdCustomInput request) {
        return new FindNomeByIdCustomOutput(convidadoService.findNomeByIdCustom(request.id));
    }
}
