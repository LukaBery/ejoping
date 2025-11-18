package com.nhnacademy.bookstore.coupon.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCouponBookId is a Querydsl query type for CouponBookId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QCouponBookId extends BeanPath<CouponBookId> {

    private static final long serialVersionUID = 1272016780L;

    public static final QCouponBookId couponBookId = new QCouponBookId("couponBookId");

    public final NumberPath<Long> bookId = createNumber("bookId", Long.class);

    public final NumberPath<Long> couponId = createNumber("couponId", Long.class);

    public QCouponBookId(String variable) {
        super(CouponBookId.class, forVariable(variable));
    }

    public QCouponBookId(Path<? extends CouponBookId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCouponBookId(PathMetadata metadata) {
        super(CouponBookId.class, metadata);
    }

}

