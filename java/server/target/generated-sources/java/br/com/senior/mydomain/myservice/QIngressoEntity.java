package br.com.senior.mydomain.myservice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIngressoEntity is a Querydsl query type for IngressoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIngressoEntity extends EntityPathBase<IngressoEntity> {

    private static final long serialVersionUID = 1686917933L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIngressoEntity ingressoEntity = new QIngressoEntity("ingressoEntity");

    public final br.com.senior.custom.QCustomEntity _super = new br.com.senior.custom.QCustomEntity(this);

    public final QConvidadoEntity convidado;

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> customData = _super.customData;

    public final DateTimePath<java.time.Instant> dataHora = createDateTime("dataHora", java.time.Instant.class);

    public final QEventoEntity evento;

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final NumberPath<Long> quantidadeAcompanhantes = createNumber("quantidadeAcompanhantes", Long.class);

    public QIngressoEntity(String variable) {
        this(IngressoEntity.class, forVariable(variable), INITS);
    }

    public QIngressoEntity(Path<? extends IngressoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QIngressoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QIngressoEntity(PathMetadata metadata, PathInits inits) {
        this(IngressoEntity.class, metadata, inits);
    }

    public QIngressoEntity(Class<? extends IngressoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.convidado = inits.isInitialized("convidado") ? new QConvidadoEntity(forProperty("convidado")) : null;
        this.evento = inits.isInitialized("evento") ? new QEventoEntity(forProperty("evento")) : null;
    }

}

