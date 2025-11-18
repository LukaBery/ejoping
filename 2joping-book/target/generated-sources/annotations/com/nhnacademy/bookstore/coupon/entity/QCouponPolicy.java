package com.nhnacademy.bookstore.coupon.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCouponPolicy is a Querydsl query type for CouponPolicy
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCouponPolicy extends EntityPathBase<CouponPolicy> {

    private static final long serialVersionUID = 1672734426L;

    public static final QCouponPolicy couponPolicy = new QCouponPolicy("couponPolicy");

    public final NumberPath<Long> couponPolicyId = createNumber("couponPolicyId", Long.class);

    public final StringPath detail = createString("detail");

    public final EnumPath<com.nhnacademy.bookstore.coupon.enums.DiscountType> discountType = createEnum("discountType", com.nhnacademy.bookstore.coupon.enums.DiscountType.class);

    public final NumberPath<Integer> discountValue = createNumber("discountValue", Integer.class);

    public final NumberPath<Integer> duration = createNumber("duration", Integer.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final NumberPath<Integer> maxDiscount = createNumber("maxDiscount", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> usageLimit = createNumber("usageLimit", Integer.class);

    public QCouponPolicy(String variable) {
        super(CouponPolicy.class, forVariable(variable));
    }

    public QCouponPolicy(Path<? extends CouponPolicy> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCouponPolicy(PathMetadata metadata) {
        super(CouponPolicy.class, metadata);
    }

}

