package br.com.senior.mydomain.myservice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QConvidadoEntity is a Querydsl query type for ConvidadoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QConvidadoEntity extends EntityPathBase<ConvidadoEntity> {

    private static final long serialVersionUID = 526049520L;

    public static final QConvidadoEntity convidadoEntity = new QConvidadoEntity("convidadoEntity");

    public final br.com.senior.custom.QCustomEntity _super = new br.com.senior.custom.QCustomEntity(this);

    public final StringPath cpf = createString("cpf");

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> customData = _super.customData;

    public final DatePath<java.time.LocalDate> dataNascimneto = createDate("dataNascimneto", java.time.LocalDate.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final StringPath nome = createString("nome");

    public final StringPath nomeSocial = createString("nomeSocial");

    public QConvidadoEntity(String variable) {
        super(ConvidadoEntity.class, forVariable(variable));
    }

    public QConvidadoEntity(Path<? extends ConvidadoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QConvidadoEntity(PathMetadata metadata) {
        super(ConvidadoEntity.class, metadata);
    }

}

