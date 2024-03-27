package br.com.senior.mydomain.myservice.ingresso;

import br.com.senior.mydomain.myservice.QConvidadoEntity;
import br.com.senior.mydomain.myservice.QIngressoEntity;
import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.UUID;

class IngressoCustomRepositoryImpl implements IngressoCustomRepository {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<UUID> getIdsByNomeConvidado(String nomeConvidado) {
        QIngressoEntity qIngresso = QIngressoEntity.ingressoEntity;
        QConvidadoEntity qConvidado = QConvidadoEntity.convidadoEntity;

        return new JPAQuery<>(entityManager)
                .select(qIngresso.id)
                .from(qIngresso)
                .join(qConvidado).on(qIngresso.convidado.eq(qConvidado))
                .where(qConvidado.nome.containsIgnoreCase(nomeConvidado))
                .fetch();
    }
}
