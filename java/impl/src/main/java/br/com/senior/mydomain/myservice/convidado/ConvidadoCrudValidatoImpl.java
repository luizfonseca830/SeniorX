package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Convidado;
import br.com.senior.mydomain.myservice.ConvidadoCrudValidator;
import br.com.senior.mydomain.myservice.ConvidadoEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        validarCpf(entity);
    }

    @Override
    public void beforeUpdate(ConvidadoEntity entity) {
        validarCpf(entity);
    }


    @Override
    public void beforeDelete(Convidado.Id id) {

    }

    private static void validarCpf(ConvidadoEntity entity) {
        Pattern pattern = Pattern.compile("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(entity.getCpf());
        boolean matchFound = matcher.find();
        if (!matchFound) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "CPF inválido");
        }
    }
}