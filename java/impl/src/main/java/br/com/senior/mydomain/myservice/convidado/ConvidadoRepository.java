package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.mydomain.myservice.ConvidadoBaseRepository;
import br.com.senior.mydomain.myservice.ConvidadoEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
interface ConvidadoRepository extends ConvidadoBaseRepository, ConvidadoRepositoryCustom {
    List<ConvidadoEntity> findByNomeContainingIgnoreCase(String nome);

    List<ConvidadoEntity> findByNome(String nome);
    @Query("select c from my_domain.my_service.ConvidadoEntity c where c.nome like :nome")
    List<ConvidadoEntity> findByNomeWithQuery(@Param("nome") String nome);
    @Query("update my_domain.my_service.ConvidadoEntity c set c.nome = :nome where c.id = :id  ")
    @Modifying
    void updateNomeById(@Param("nome") String nome, @Param("id") UUID id);
    List<ConvidadoEntity> findByCpf(String cpf);
}
