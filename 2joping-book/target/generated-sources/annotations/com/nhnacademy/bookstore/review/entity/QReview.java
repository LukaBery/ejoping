package com.nhnacademy.bookstore.review.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReview is a Querydsl query type for Review
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReview extends EntityPathBase<Review> {

    private static final long serialVersionUID = -1549608340L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReview review = new QReview("review");

    public final com.nhnacademy.bookstore.bookset.book.entity.QBook book;

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final StringPath imageUrl = createString("imageUrl");

    public final com.nhnacademy.bookstore.user.member.entity.QMember member;

    public final com.nhnacademy.bookstore.orderset.orderdetail.entity.QOrderDetail orderDetail;

    public final NumberPath<Integer> ratingValue = createNumber("ratingValue", Integer.class);

    public final NumberPath<Long> reviewId = createNumber("reviewId", Long.class);

    public final StringPath text = createString("text");

    public final StringPath title = createString("title");

    public final DateTimePath<java.sql.Timestamp> updatedAt = createDateTime("updatedAt", java.sql.Timestamp.class);

    public QReview(String variable) {
        this(Review.class, forVariable(variable), INITS);
    }

    public QReview(Path<? extends Review> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReview(PathMetadata metadata, PathInits inits) {
        this(Review.class, metadata, inits);
    }

    public QReview(Class<? extends Review> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.book = inits.isInitialized("book") ? new com.nhnacademy.bookstore.bookset.book.entity.QBook(forProperty("book"), inits.get("book")) : null;
        this.member = inits.isInitialized("member") ? new com.nhnacademy.bookstore.user.member.entity.QMember(forProperty("member"), inits.get("member")) : null;
        this.orderDetail = inits.isInitialized("orderDetail") ? new com.nhnacademy.bookstore.orderset.orderdetail.entity.QOrderDetail(forProperty("orderDetail"), inits.get("orderDetail")) : null;
    }

}

