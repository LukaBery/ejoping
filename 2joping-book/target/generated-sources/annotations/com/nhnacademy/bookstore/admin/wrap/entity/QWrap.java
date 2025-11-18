package com.nhnacademy.bookstore.admin.wrap.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QWrap is a Querydsl query type for Wrap
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWrap extends EntityPathBase<Wrap> {

    private static final long serialVersionUID = -1139726449L;

    public static final QWrap wrap = new QWrap("wrap");

    public final BooleanPath isActive = createBoolean("isActive");

    public final StringPath name = createString("name");

    public final NumberPath<Long> wrapId = createNumber("wrapId", Long.class);

    public final NumberPath<Integer> wrapPrice = createNumber("wrapPrice", Integer.class);

    public QWrap(String variable) {
        super(Wrap.class, forVariable(variable));
    }

    public QWrap(Path<? extends Wrap> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWrap(PathMetadata metadata) {
        super(Wrap.class, metadata);
    }

}

