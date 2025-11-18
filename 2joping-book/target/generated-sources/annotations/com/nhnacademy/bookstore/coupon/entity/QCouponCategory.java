package com.nhnacademy.bookstore.coupon.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCouponCategory is a Querydsl query type for CouponCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCouponCategory extends EntityPathBase<CouponCategory> {

    private static final long serialVersionUID = 683619494L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCouponCategory couponCategory = new QCouponCategory("couponCategory");

    public final com.nhnacademy.bookstore.bookset.category.entity.QCategory category;

    public final QCoupon coupon;

    public final QCouponCategoryId id;

    public QCouponCategory(String variable) {
        this(CouponCategory.class, forVariable(variable), INITS);
    }

    public QCouponCategory(Path<? extends CouponCategory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCouponCategory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCouponCategory(PathMetadata metadata, PathInits inits) {
        this(CouponCategory.class, metadata, inits);
    }

    public QCouponCategory(Class<? extends CouponCategory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new com.nhnacademy.bookstore.bookset.category.entity.QCategory(forProperty("category"), inits.get("category")) : null;
        this.coupon = inits.isInitialized("coupon") ? new QCoupon(forProperty("coupon"), inits.get("coupon")) : null;
        this.id = inits.isInitialized("id") ? new QCouponCategoryId(forProperty("id")) : null;
    }

}

