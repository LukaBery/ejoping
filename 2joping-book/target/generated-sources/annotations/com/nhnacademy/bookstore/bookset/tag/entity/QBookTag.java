package com.nhnacademy.bookstore.bookset.tag.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookTag is a Querydsl query type for BookTag
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookTag extends EntityPathBase<BookTag> {

    private static final long serialVersionUID = 372890670L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookTag bookTag = new QBookTag("bookTag");

    public final com.nhnacademy.bookstore.bookset.book.entity.QBook book;

    public final QBookTag_BookTagId id;

    public final QTag tag;

    public QBookTag(String variable) {
        this(BookTag.class, forVariable(variable), INITS);
    }

    public QBookTag(Path<? extends BookTag> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookTag(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookTag(PathMetadata metadata, PathInits inits) {
        this(BookTag.class, metadata, inits);
    }

    public QBookTag(Class<? extends BookTag> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.book = inits.isInitialized("book") ? new com.nhnacademy.bookstore.bookset.book.entity.QBook(forProperty("book"), inits.get("book")) : null;
        this.id = inits.isInitialized("id") ? new QBookTag_BookTagId(forProperty("id")) : null;
        this.tag = inits.isInitialized("tag") ? new QTag(forProperty("tag")) : null;
    }

}

