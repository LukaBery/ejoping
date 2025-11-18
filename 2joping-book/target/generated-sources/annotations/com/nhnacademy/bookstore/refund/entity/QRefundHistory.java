package com.nhnacademy.bookstore.refund.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRefundHistory is a Querydsl query type for RefundHistory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRefundHistory extends EntityPathBase<RefundHistory> {

    private static final long serialVersionUID = 1652715592L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRefundHistory refundHistory = new QRefundHistory("refundHistory");

    public final DateTimePath<java.time.LocalDateTime> approvedAt = createDateTime("approvedAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final BooleanPath isApproved = createBoolean("isApproved");

    public final com.nhnacademy.bookstore.orderset.order.entity.QOrder order;

    public final NumberPath<Integer> refundFee = createNumber("refundFee", Integer.class);

    public final NumberPath<Long> refundHistoryId = createNumber("refundHistoryId", Long.class);

    public final QRefundPolicy refundPolicy;

    public final NumberPath<Long> savePoint = createNumber("savePoint", Long.class);

    public QRefundHistory(String variable) {
        this(RefundHistory.class, forVariable(variable), INITS);
    }

    public QRefundHistory(Path<? extends RefundHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRefundHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRefundHistory(PathMetadata metadata, PathInits inits) {
        this(RefundHistory.class, metadata, inits);
    }

    public QRefundHistory(Class<? extends RefundHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new com.nhnacademy.bookstore.orderset.order.entity.QOrder(forProperty("order"), inits.get("order")) : null;
        this.refundPolicy = inits.isInitialized("refundPolicy") ? new QRefundPolicy(forProperty("refundPolicy")) : null;
    }

}

