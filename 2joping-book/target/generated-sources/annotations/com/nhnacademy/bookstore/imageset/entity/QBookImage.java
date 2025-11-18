package com.nhnacademy.bookstore.imageset.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookImage is a Querydsl query type for BookImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookImage extends EntityPathBase<BookImage> {

    private static final long serialVersionUID = 1309810223L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookImage bookImage = new QBookImage("bookImage");

    public final com.nhnacademy.bookstore.bookset.book.entity.QBook book;

    public final NumberPath<Long> bookImageId = createNumber("bookImageId", Long.class);

    public final QImage image;

    public final StringPath imageType = createString("imageType");

    public QBookImage(String variable) {
        this(BookImage.class, forVariable(variable), INITS);
    }

    public QBookImage(Path<? extends BookImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookImage(PathMetadata metadata, PathInits inits) {
        this(BookImage.class, metadata, inits);
    }

    public QBookImage(Class<? extends BookImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.book = inits.isInitialized("book") ? new com.nhnacademy.bookstore.bookset.book.entity.QBook(forProperty("book"), inits.get("book")) : null;
        this.image = inits.isInitialized("image") ? new QImage(forProperty("image")) : null;
    }

}

