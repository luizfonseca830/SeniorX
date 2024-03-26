package br.com.senior.mydomain.myservice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEventoEntity is a Querydsl query type for EventoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEventoEntity extends EntityPathBase<EventoEntity> {

    private static final long serialVersionUID = 998288296L;

    public static final QEventoEntity eventoEntity = new QEventoEntity("eventoEntity");

    public final br.com.senior.custom.QCustomEntity _super = new br.com.senior.custom.QCustomEntity(this);

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> customData = _super.customData;

    public final DateTimePath<java.time.Instant> dataHora = createDateTime("dataHora", java.time.Instant.class);

    public final StringPath endereco = createString("endereco");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final ListPath<IngressoEntity, QIngressoEntity> ingressos = this.<IngressoEntity, QIngressoEntity>createList("ingressos", IngressoEntity.class, QIngressoEntity.class, PathInits.DIRECT2);

    public final NumberPath<Long> lotacaoMaxima = createNumber("lotacaoMaxima", Long.class);

    public final StringPath nome = createString("nome");

    public final SetPath<TipoEntrada, EnumPath<TipoEntrada>> tipoentradaevento = this.<TipoEntrada, EnumPath<TipoEntrada>>createSet("tipoentradaevento", TipoEntrada.class, EnumPath.class, PathInits.DIRECT2);

    public QEventoEntity(String variable) {
        super(EventoEntity.class, forVariable(variable));
    }

    public QEventoEntity(Path<? extends EventoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEventoEntity(PathMetadata metadata) {
        super(EventoEntity.class, metadata);
    }

}

