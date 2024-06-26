package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.mydomain.myservice.QConvidadoEntity;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAUpdateClause;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.UUID;

class ConvidadoRepositoryCustomImpl implements ConvidadoRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public String findNomeByIdCustom(String id) {

        return entityManager
                .createQuery("select c.nome from my_domain.my_service.ConvidadoEntity c where c.id = :id", String.class)
                .setParameter("id", UUID.fromString(id))
                .getSingleResult();
    }

    @Override
    public List<UUID> getAllIds() {
        QConvidadoEntity qConvidado = QConvidadoEntity.convidadoEntity;

        return new JPAQuery<>(entityManager)
                .select(qConvidado.id)
                .from(qConvidado)
                .fetch();
    }

    @Override
    public void updateNomeSocialByNome(String nome, String nomeSocial) {
        QConvidadoEntity convidadoEntity = QConvidadoEntity.convidadoEntity;

        new JPAUpdateClause(entityManager, convidadoEntity)
                .set(convidadoEntity.nomeSocial, nomeSocial)
                .where(convidadoEntity.nome.eq(nome))
                .execute();
    }
}
