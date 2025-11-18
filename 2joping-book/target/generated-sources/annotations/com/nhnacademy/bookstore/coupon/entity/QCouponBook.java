package com.nhnacademy.bookstore.coupon.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCouponBook is a Querydsl query type for CouponBook
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCouponBook extends EntityPathBase<CouponBook> {

    private static final long serialVersionUID = 1659422353L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCouponBook couponBook = new QCouponBook("couponBook");

    public final com.nhnacademy.bookstore.bookset.book.entity.QBook book;

    public final QCoupon coupon;

    public final QCouponBookId id;

    public QCouponBook(String variable) {
        this(CouponBook.class, forVariable(variable), INITS);
    }

    public QCouponBook(Path<? extends CouponBook> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCouponBook(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCouponBook(PathMetadata metadata, PathInits inits) {
        this(CouponBook.class, metadata, inits);
    }

    public QCouponBook(Class<? extends CouponBook> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.book = inits.isInitialized("book") ? new com.nhnacademy.bookstore.bookset.book.entity.QBook(forProperty("book"), inits.get("book")) : null;
        this.coupon = inits.isInitialized("coupon") ? new QCoupon(forProperty("coupon"), inits.get("coupon")) : null;
        this.id = inits.isInitialized("id") ? new QCouponBookId(forProperty("id")) : null;
    }

}

