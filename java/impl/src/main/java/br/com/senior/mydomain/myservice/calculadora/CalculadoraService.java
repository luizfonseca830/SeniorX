package br.com.senior.mydomain.myservice.calculadora;

import br.com.senior.mydomain.myservice.FieldCalculadora;
import br.com.senior.mydomain.myservice.FieldResultadoCalculadora;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import com.google.errorprone.annotations.FormatString;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class CalculadoraService {

    @Inject
    TranslationHubApi translationHubApi;

    public String adicao(Double x, Double y){

        return translationHubApi.getMessage("br.com.senior.my_domain.my_service.calculo.adicao") + x + y;
    }

    public String subtracao(Double x, Double y){
        return null;
    }

    public String multiplicacao(Double x, Double y){
        return null;
    }

    public String divisao(Double x, Double y){
        return null;
    }
}
