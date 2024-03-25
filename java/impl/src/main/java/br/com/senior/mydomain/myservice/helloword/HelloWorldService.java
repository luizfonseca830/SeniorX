package br.com.senior.mydomain.myservice.helloword;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.HelloWorldOutput;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class HelloWorldService {

    @Inject
    private TranslationHubApi translationHubApi;

    public String getHelloWorldMessage(String who) {
        if (who.toLowerCase().startsWith("jorge")) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.invalid.name"));
        }

        HelloWorldOutput ret = new HelloWorldOutput();
        try {
            return translationHubApi.getFormattedMessage("br.com.senior.my_domain.my_service.hello_world", who);
        } catch (Exception e) {
            throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("br.com.senior.my_domain.my_service.error.server"));
        }


    }
}
