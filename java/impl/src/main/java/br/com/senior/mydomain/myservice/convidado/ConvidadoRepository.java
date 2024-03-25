package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.mydomain.myservice.ConvidadoBaseRepository;
import br.com.senior.mydomain.myservice.ConvidadoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConvidadoRepository extends ConvidadoBaseRepository {
    List<ConvidadoEntity> findByNomeContainingIgnoreCase(String nome);
    @Query("select c from my_domain.my_service.ConvidadoEntity c where c.nome like :nome")
    List<ConvidadoEntity> findByNomeWithQuery(@Param("nome") String nome);
}
