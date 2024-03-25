package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

import javax.inject.Inject;

@HandlerImpl
public class HelloWorldImpl implements HelloWorld {

    @Inject
    private TranslationHubApi translationHubApi;

    @Override
    public HelloWorldOutput helloWorld(HelloWorldInput request) {
        if (request.who.toLowerCase().startsWith("jorge")) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.invalid.name"));
        }

        HelloWorldOutput ret = new HelloWorldOutput();
        try {
            final String messagemTraduzida = translationHubApi.getFormattedMessage("br.com.senior.my_domain.my_service.hello_world", request.who);

            ret.helloWorldMessage = messagemTraduzida;
        } catch (Exception e){
            throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("br.com.senior.my_domain.my_service.error.server"));
        }

        return ret;
    }
}
