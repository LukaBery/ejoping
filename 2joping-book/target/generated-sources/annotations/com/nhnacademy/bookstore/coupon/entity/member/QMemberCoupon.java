package com.nhnacademy.bookstore.coupon.entity.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberCoupon is a Querydsl query type for MemberCoupon
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberCoupon extends EntityPathBase<MemberCoupon> {

    private static final long serialVersionUID = -65866158L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberCoupon memberCoupon = new QMemberCoupon("memberCoupon");

    public final com.nhnacademy.bookstore.coupon.entity.QCoupon coupon;

    public final NumberPath<Long> couponUsageId = createNumber("couponUsageId", Long.class);

    public final DateTimePath<java.time.LocalDateTime> invalidTime = createDateTime("invalidTime", java.time.LocalDateTime.class);

    public final BooleanPath isUsed = createBoolean("isUsed");

    public final com.nhnacademy.bookstore.user.member.entity.QMember member;

    public final DateTimePath<java.time.LocalDateTime> receiveTime = createDateTime("receiveTime", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> usedDate = createDateTime("usedDate", java.time.LocalDateTime.class);

    public QMemberCoupon(String variable) {
        this(MemberCoupon.class, forVariable(variable), INITS);
    }

    public QMemberCoupon(Path<? extends MemberCoupon> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberCoupon(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberCoupon(PathMetadata metadata, PathInits inits) {
        this(MemberCoupon.class, metadata, inits);
    }

    public QMemberCoupon(Class<? extends MemberCoupon> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coupon = inits.isInitialized("coupon") ? new com.nhnacademy.bookstore.coupon.entity.QCoupon(forProperty("coupon"), inits.get("coupon")) : null;
        this.member = inits.isInitialized("member") ? new com.nhnacademy.bookstore.user.member.entity.QMember(forProperty("member"), inits.get("member")) : null;
    }

}

