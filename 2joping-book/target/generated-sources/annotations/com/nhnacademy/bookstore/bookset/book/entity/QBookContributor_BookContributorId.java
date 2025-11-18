package com.nhnacademy.bookstore.bookset.book.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBookContributor_BookContributorId is a Querydsl query type for BookContributorId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QBookContributor_BookContributorId extends BeanPath<BookContributor.BookContributorId> {

    private static final long serialVersionUID = -2047693577L;

    public static final QBookContributor_BookContributorId bookContributorId = new QBookContributor_BookContributorId("bookContributorId");

    public final NumberPath<Long> bookId = createNumber("bookId", Long.class);

    public final NumberPath<Long> contributorId = createNumber("contributorId", Long.class);

    public QBookContributor_BookContributorId(String variable) {
        super(BookContributor.BookContributorId.class, forVariable(variable));
    }

    public QBookContributor_BookContributorId(Path<? extends BookContributor.BookContributorId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBookContributor_BookContributorId(PathMetadata metadata) {
        super(BookContributor.BookContributorId.class, metadata);
    }

}

