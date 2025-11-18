package com.nhnacademy.bookstore.bookset.book.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookContributor is a Querydsl query type for BookContributor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookContributor extends EntityPathBase<BookContributor> {

    private static final long serialVersionUID = 1279584920L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookContributor bookContributor = new QBookContributor("bookContributor");

    public final QBook book;

    public final com.nhnacademy.bookstore.bookset.contributor.entity.QContributor contributor;

    public final QBookContributor_BookContributorId id;

    public QBookContributor(String variable) {
        this(BookContributor.class, forVariable(variable), INITS);
    }

    public QBookContributor(Path<? extends BookContributor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookContributor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookContributor(PathMetadata metadata, PathInits inits) {
        this(BookContributor.class, metadata, inits);
    }

    public QBookContributor(Class<? extends BookContributor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.book = inits.isInitialized("book") ? new QBook(forProperty("book"), inits.get("book")) : null;
        this.contributor = inits.isInitialized("contributor") ? new com.nhnacademy.bookstore.bookset.contributor.entity.QContributor(forProperty("contributor"), inits.get("contributor")) : null;
        this.id = inits.isInitialized("id") ? new QBookContributor_BookContributorId(forProperty("id")) : null;
    }

}

