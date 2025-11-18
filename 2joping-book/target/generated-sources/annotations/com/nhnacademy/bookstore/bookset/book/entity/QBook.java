package com.nhnacademy.bookstore.bookset.book.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBook is a Querydsl query type for Book
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBook extends EntityPathBase<Book> {

    private static final long serialVersionUID = 277325379L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBook book = new QBook("book");

    public final NumberPath<Long> bookId = createNumber("bookId", Long.class);

    public final StringPath description = createString("description");

    public final BooleanPath giftWrappable = createBoolean("giftWrappable");

    public final BooleanPath isActive = createBoolean("isActive");

    public final StringPath isbn = createString("isbn");

    public final ListPath<com.nhnacademy.bookstore.like.entity.Like, com.nhnacademy.bookstore.like.entity.QLike> likedBy = this.<com.nhnacademy.bookstore.like.entity.Like, com.nhnacademy.bookstore.like.entity.QLike>createList("likedBy", com.nhnacademy.bookstore.like.entity.Like.class, com.nhnacademy.bookstore.like.entity.QLike.class, PathInits.DIRECT2);

    public final NumberPath<Integer> likes = createNumber("likes", Integer.class);

    public final DatePath<java.time.LocalDate> publishedDate = createDate("publishedDate", java.time.LocalDate.class);

    public final com.nhnacademy.bookstore.bookset.publisher.entity.QPublisher publisher;

    public final NumberPath<Integer> remainQuantity = createNumber("remainQuantity", Integer.class);

    public final NumberPath<Integer> retailPrice = createNumber("retailPrice", Integer.class);

    public final NumberPath<Integer> sellingPrice = createNumber("sellingPrice", Integer.class);

    public final StringPath title = createString("title");

    public final NumberPath<Integer> views = createNumber("views", Integer.class);

    public QBook(String variable) {
        this(Book.class, forVariable(variable), INITS);
    }

    public QBook(Path<? extends Book> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBook(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBook(PathMetadata metadata, PathInits inits) {
        this(Book.class, metadata, inits);
    }

    public QBook(Class<? extends Book> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.publisher = inits.isInitialized("publisher") ? new com.nhnacademy.bookstore.bookset.publisher.entity.QPublisher(forProperty("publisher")) : null;
    }

}

