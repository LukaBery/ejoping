package com.nhnacademy.bookstore.user.memberstatus.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberStatus is a Querydsl query type for MemberStatus
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberStatus extends EntityPathBase<MemberStatus> {

    private static final long serialVersionUID = -848505191L;

    public static final QMemberStatus memberStatus = new QMemberStatus("memberStatus");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath status = createString("status");

    public QMemberStatus(String variable) {
        super(MemberStatus.class, forVariable(variable));
    }

    public QMemberStatus(Path<? extends MemberStatus> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberStatus(PathMetadata metadata) {
        super(MemberStatus.class, metadata);
    }

}

