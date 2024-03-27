package br.com.senior.mydomain.myservice.ingresso;

import br.com.senior.mydomain.myservice.IngressoBaseRepository;
import br.com.senior.mydomain.myservice.IngressoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface IngressoRepository extends IngressoBaseRepository, IngressoCustomRepository {
    @Query("select i from my_domain.my_service.IngressoEntity i " +
            "join my_domain.my_service.ConvidadoEntity c " +
            "on c.id = i.convidado " +
            "where c.nome like :nome")
    List<IngressoEntity> findByNomeConvidado (@Param("nome") String nome);
}
