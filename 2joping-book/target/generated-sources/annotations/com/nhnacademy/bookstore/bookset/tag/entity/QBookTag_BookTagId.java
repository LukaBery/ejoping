package com.nhnacademy.bookstore.bookset.tag.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBookTag_BookTagId is a Querydsl query type for BookTagId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QBookTag_BookTagId extends BeanPath<BookTag.BookTagId> {

    private static final long serialVersionUID = -2107640052L;

    public static final QBookTag_BookTagId bookTagId = new QBookTag_BookTagId("bookTagId");

    public final NumberPath<Long> bookId = createNumber("bookId", Long.class);

    public final NumberPath<Long> tagId = createNumber("tagId", Long.class);

    public QBookTag_BookTagId(String variable) {
        super(BookTag.BookTagId.class, forVariable(variable));
    }

    public QBookTag_BookTagId(Path<? extends BookTag.BookTagId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBookTag_BookTagId(PathMetadata metadata) {
        super(BookTag.BookTagId.class, metadata);
    }

}

