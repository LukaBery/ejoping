package com.nhnacademy.bookstore.coupon.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCouponCategoryId is a Querydsl query type for CouponCategoryId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QCouponCategoryId extends BeanPath<CouponCategoryId> {

    private static final long serialVersionUID = -171660191L;

    public static final QCouponCategoryId couponCategoryId = new QCouponCategoryId("couponCategoryId");

    public final NumberPath<Long> categoryId = createNumber("categoryId", Long.class);

    public final NumberPath<Long> couponId = createNumber("couponId", Long.class);

    public QCouponCategoryId(String variable) {
        super(CouponCategoryId.class, forVariable(variable));
    }

    public QCouponCategoryId(Path<? extends CouponCategoryId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCouponCategoryId(PathMetadata metadata) {
        super(CouponCategoryId.class, metadata);
    }

}

