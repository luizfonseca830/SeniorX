package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Convidado;
import br.com.senior.mydomain.myservice.ConvidadoCrudServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ConvidadoCrudServiceCustomImpl extends ConvidadoCrudServiceImpl {

    @Override
    public void deleteConvidado(Convidado.Id id) {
        throw new ServiceException(ErrorCategory.BAD_REQUEST, "Não é possível remover um convidado");
    }
}
