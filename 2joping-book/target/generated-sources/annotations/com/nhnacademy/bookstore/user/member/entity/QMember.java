package com.nhnacademy.bookstore.user.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -1110025771L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember member = new QMember("member1");

    public final com.nhnacademy.bookstore.user.customer.entity.QCustomer _super;

    public final NumberPath<Integer> accPurchase = createNumber("accPurchase", Integer.class);

    public final ListPath<MemberAddress, QMemberAddress> addresses = this.<MemberAddress, QMemberAddress>createList("addresses", MemberAddress.class, QMemberAddress.class, PathInits.DIRECT2);

    public final DatePath<java.time.LocalDate> birthday = createDate("birthday", java.time.LocalDate.class);

    public final NumberPath<Integer> birthdayMonth = createNumber("birthdayMonth", Integer.class);

    //inherited
    public final StringPath email;

    public final EnumPath<com.nhnacademy.bookstore.user.enums.Gender> gender = createEnum("gender", com.nhnacademy.bookstore.user.enums.Gender.class);

    //inherited
    public final NumberPath<Long> id;

    public final BooleanPath isPaycoLogin = createBoolean("isPaycoLogin");

    public final DatePath<java.time.LocalDate> joinDate = createDate("joinDate", java.time.LocalDate.class);

    public final ListPath<com.nhnacademy.bookstore.like.entity.Like, com.nhnacademy.bookstore.like.entity.QLike> likes = this.<com.nhnacademy.bookstore.like.entity.Like, com.nhnacademy.bookstore.like.entity.QLike>createList("likes", com.nhnacademy.bookstore.like.entity.Like.class, com.nhnacademy.bookstore.like.entity.QLike.class, PathInits.DIRECT2);

    public final StringPath loginId = createString("loginId");

    public final ListPath<com.nhnacademy.bookstore.coupon.entity.member.MemberCoupon, com.nhnacademy.bookstore.coupon.entity.member.QMemberCoupon> memberCoupons = this.<com.nhnacademy.bookstore.coupon.entity.member.MemberCoupon, com.nhnacademy.bookstore.coupon.entity.member.QMemberCoupon>createList("memberCoupons", com.nhnacademy.bookstore.coupon.entity.member.MemberCoupon.class, com.nhnacademy.bookstore.coupon.entity.member.QMemberCoupon.class, PathInits.DIRECT2);

    //inherited
    public final StringPath name;

    public final StringPath nickname = createString("nickname");

    // inherited
    public final com.nhnacademy.bookstore.user.nonmember.entity.QNonMember nonMember;

    public final StringPath password = createString("password");

    //inherited
    public final StringPath phone;

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final DatePath<java.time.LocalDate> recentLoginDate = createDate("recentLoginDate", java.time.LocalDate.class);

    public final com.nhnacademy.bookstore.user.memberstatus.entity.QMemberStatus status;

    public final com.nhnacademy.bookstore.user.tier.entity.QMemberTier tier;

    public QMember(String variable) {
        this(Member.class, forVariable(variable), INITS);
    }

    public QMember(Path<? extends Member> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMember(PathMetadata metadata, PathInits inits) {
        this(Member.class, metadata, inits);
    }

    public QMember(Class<? extends Member> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new com.nhnacademy.bookstore.user.customer.entity.QCustomer(type, metadata, inits);
        this.email = _super.email;
        this.id = _super.id;
        this.name = _super.name;
        this.nonMember = _super.nonMember;
        this.phone = _super.phone;
        this.status = inits.isInitialized("status") ? new com.nhnacademy.bookstore.user.memberstatus.entity.QMemberStatus(forProperty("status")) : null;
        this.tier = inits.isInitialized("tier") ? new com.nhnacademy.bookstore.user.tier.entity.QMemberTier(forProperty("tier")) : null;
    }

}

