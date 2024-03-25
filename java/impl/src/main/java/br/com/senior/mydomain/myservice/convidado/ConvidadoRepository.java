package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.mydomain.myservice.ConvidadoBaseRepository;
import br.com.senior.mydomain.myservice.ConvidadoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConvidadoRepository extends ConvidadoBaseRepository {
    List<ConvidadoEntity> findByNomeContainingIgnoreCase(String nome);
}
