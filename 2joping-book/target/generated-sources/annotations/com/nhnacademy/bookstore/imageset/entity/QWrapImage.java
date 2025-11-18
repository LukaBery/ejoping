package com.nhnacademy.bookstore.imageset.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWrapImage is a Querydsl query type for WrapImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWrapImage extends EntityPathBase<WrapImage> {

    private static final long serialVersionUID = -750535314L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWrapImage wrapImage = new QWrapImage("wrapImage");

    public final QImage image;

    public final NumberPath<Long> packageImageId = createNumber("packageImageId", Long.class);

    public final com.nhnacademy.bookstore.admin.wrap.entity.QWrap wrap;

    public QWrapImage(String variable) {
        this(WrapImage.class, forVariable(variable), INITS);
    }

    public QWrapImage(Path<? extends WrapImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWrapImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWrapImage(PathMetadata metadata, PathInits inits) {
        this(WrapImage.class, metadata, inits);
    }

    public QWrapImage(Class<? extends WrapImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.image = inits.isInitialized("image") ? new QImage(forProperty("image")) : null;
        this.wrap = inits.isInitialized("wrap") ? new com.nhnacademy.bookstore.admin.wrap.entity.QWrap(forProperty("wrap")) : null;
    }

}

