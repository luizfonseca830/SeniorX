package br.com.senior.mydomain.myservice.atracao;

import br.com.senior.mydomain.myservice.QAtracaoEntity;
import br.com.senior.mydomain.myservice.QEventoEntity;
import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class AtracaoRepositoryCustomImpl implements AtracaoRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<String> getAtracaoByNomeEvento(String nomeEvento) {
        QAtracaoEntity qAtracao = QAtracaoEntity.atracaoEntity;
        QEventoEntity qEvento = QEventoEntity.eventoEntity;

        return new JPAQuery<>(entityManager)
                .select(qAtracao.nome)
                .from(qAtracao)
                .join(qEvento).on(qAtracao.evento.eq(qEvento))
                .where(qEvento.nome.containsIgnoreCase(nomeEvento))
                .fetch();
    }
}
