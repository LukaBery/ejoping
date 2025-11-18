package com.nhnacademy.bookstore.refund.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRefundPolicy is a Querydsl query type for RefundPolicy
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRefundPolicy extends EntityPathBase<RefundPolicy> {

    private static final long serialVersionUID = -1097805058L;

    public static final QRefundPolicy refundPolicy = new QRefundPolicy("refundPolicy");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> period = createNumber("period", Integer.class);

    public final EnumPath<RefundPolicy.PolicyType> policy = createEnum("policy", RefundPolicy.PolicyType.class);

    public final NumberPath<Integer> refundFee = createNumber("refundFee", Integer.class);

    public final NumberPath<Long> refundPolicyId = createNumber("refundPolicyId", Long.class);

    public QRefundPolicy(String variable) {
        super(RefundPolicy.class, forVariable(variable));
    }

    public QRefundPolicy(Path<? extends RefundPolicy> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRefundPolicy(PathMetadata metadata) {
        super(RefundPolicy.class, metadata);
    }

}

