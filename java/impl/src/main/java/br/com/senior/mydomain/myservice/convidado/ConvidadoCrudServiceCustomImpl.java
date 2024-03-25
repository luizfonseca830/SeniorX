package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.mydomain.myservice.Convidado;
import br.com.senior.mydomain.myservice.ConvidadoCrudServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ConvidadoCrudServiceCustomImpl extends ConvidadoCrudServiceImpl {

    @Override
    public void deleteConvidado(Convidado.Id id) {

        super.deleteConvidado(id);
    }
}
