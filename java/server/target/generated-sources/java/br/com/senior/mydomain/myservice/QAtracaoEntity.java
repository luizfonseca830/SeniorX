package br.com.senior.mydomain.myservice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAtracaoEntity is a Querydsl query type for AtracaoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAtracaoEntity extends EntityPathBase<AtracaoEntity> {

    private static final long serialVersionUID = 1940600674L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAtracaoEntity atracaoEntity = new QAtracaoEntity("atracaoEntity");

    public final br.com.senior.custom.QCustomEntity _super = new br.com.senior.custom.QCustomEntity(this);

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> customData = _super.customData;

    public final DateTimePath<java.time.Instant> dataHora = createDateTime("dataHora", java.time.Instant.class);

    public final QEventoEntity evento;

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final StringPath local = createString("local");

    public final StringPath nome = createString("nome");

    public QAtracaoEntity(String variable) {
        this(AtracaoEntity.class, forVariable(variable), INITS);
    }

    public QAtracaoEntity(Path<? extends AtracaoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAtracaoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAtracaoEntity(PathMetadata metadata, PathInits inits) {
        this(AtracaoEntity.class, metadata, inits);
    }

    public QAtracaoEntity(Class<? extends AtracaoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.evento = inits.isInitialized("evento") ? new QEventoEntity(forProperty("evento")) : null;
    }

}

