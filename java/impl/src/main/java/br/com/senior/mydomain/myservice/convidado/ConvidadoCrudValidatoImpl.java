package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.mydomain.myservice.Convidado;
import br.com.senior.mydomain.myservice.ConvidadoCrudValidator;
import br.com.senior.mydomain.myservice.ConvidadoEntity;
import org.springframework.stereotype.Component;

@Component
public class ConvidadoCrudValidatoImpl implements ConvidadoCrudValidator {
    @Override
    public void beforeCreate(ConvidadoEntity entity) {
        System.out.println("Criou um convidado");
    }

    @Override
    public void beforeUpdate(ConvidadoEntity entity) {

    }

    @Override
    public void beforeDelete(Convidado.Id id) {

    }
}
