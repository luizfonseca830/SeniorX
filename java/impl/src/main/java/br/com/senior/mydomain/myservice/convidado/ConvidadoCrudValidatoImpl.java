package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Convidado;
import br.com.senior.mydomain.myservice.ConvidadoCrudValidator;
import br.com.senior.mydomain.myservice.ConvidadoEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class ConvidadoCrudValidatoImpl implements ConvidadoCrudValidator {

    @Inject
    TranslationHubApi translationHubApi;

    @Override
    public void beforeCreate(ConvidadoEntity entity) {
        if (entity.getNome().toLowerCase().startsWith("jorge")) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST,
                    translationHubApi.getFormattedMessage("br.com.senior.my_domain.my_service.convidado.nao.permitido"
                            , entity.getNome()));
        }
    }

    @Override
    public void beforeUpdate(ConvidadoEntity entity) {

    }

    @Override
    public void beforeDelete(Convidado.Id id) {

    }
}
