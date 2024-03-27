package br.com.senior.mydomain.myservice.convidado.handler;

import br.com.senior.SecurityConstants;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.convidado.ConvidadoConverter;
import br.com.senior.mydomain.myservice.convidado.ConvidadoService;

import javax.inject.Inject;

@HandlerImpl
public class UpdateConvidadoNomeByIdHandlerImpl implements UpdateConvidadoNomeById {
    @Inject
    private ConvidadoService convidadoService;

    @Inject
    private ConvidadoConverter convidadoConverter;
    @Override
    @SecureResource(name = ConvidadoEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_VIEW)
    @SecureResource(name = ConvidadoEntity.SECURITY_RESOURCE, action = SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE)
    public UpdateConvidadoNomeByIdOutput updateConvidadoNomeById(UpdateConvidadoNomeByIdInput request) {

        final ConvidadoEntity convidado = convidadoService.updateNomeById(request.nome, request.id);

        return convidadoConverter.toUpdateConvidadoNomeByIdOuput(convidado);
    }
}
