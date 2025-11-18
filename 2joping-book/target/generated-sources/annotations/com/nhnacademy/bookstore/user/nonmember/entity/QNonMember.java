package com.nhnacademy.bookstore.user.nonmember.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNonMember is a Querydsl query type for NonMember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNonMember extends EntityPathBase<NonMember> {

    private static final long serialVersionUID = -1989902649L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNonMember nonMember = new QNonMember("nonMember");

    public final com.nhnacademy.bookstore.user.customer.entity.QCustomer customer;

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath password = createString("password");

    public QNonMember(String variable) {
        this(NonMember.class, forVariable(variable), INITS);
    }

    public QNonMember(Path<? extends NonMember> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNonMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNonMember(PathMetadata metadata, PathInits inits) {
        this(NonMember.class, metadata, inits);
    }

    public QNonMember(Class<? extends NonMember> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new com.nhnacademy.bookstore.user.customer.entity.QCustomer(forProperty("customer"), inits.get("customer")) : null;
    }

}

