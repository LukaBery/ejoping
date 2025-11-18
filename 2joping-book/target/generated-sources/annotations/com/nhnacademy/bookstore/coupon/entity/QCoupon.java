package com.nhnacademy.bookstore.coupon.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoupon is a Querydsl query type for Coupon
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoupon extends EntityPathBase<Coupon> {

    private static final long serialVersionUID = 399645576L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCoupon coupon = new QCoupon("coupon");

    public final QCouponPolicy couponPolicy;

    public final DatePath<java.time.LocalDate> createdAt = createDate("createdAt", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> expiredAt = createDate("expiredAt", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.nhnacademy.bookstore.coupon.entity.member.MemberCoupon, com.nhnacademy.bookstore.coupon.entity.member.QMemberCoupon> memberCoupons = this.<com.nhnacademy.bookstore.coupon.entity.member.MemberCoupon, com.nhnacademy.bookstore.coupon.entity.member.QMemberCoupon>createList("memberCoupons", com.nhnacademy.bookstore.coupon.entity.member.MemberCoupon.class, com.nhnacademy.bookstore.coupon.entity.member.QMemberCoupon.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public QCoupon(String variable) {
        this(Coupon.class, forVariable(variable), INITS);
    }

    public QCoupon(Path<? extends Coupon> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCoupon(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCoupon(PathMetadata metadata, PathInits inits) {
        this(Coupon.class, metadata, inits);
    }

    public QCoupon(Class<? extends Coupon> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.couponPolicy = inits.isInitialized("couponPolicy") ? new QCouponPolicy(forProperty("couponPolicy")) : null;
    }

}

