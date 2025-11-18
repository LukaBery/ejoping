package com.nhnacademy.bookstore.paymentset.paymenthistory.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPaymentHistory is a Querydsl query type for PaymentHistory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPaymentHistory extends EntityPathBase<PaymentHistory> {

    private static final long serialVersionUID = 1314422572L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPaymentHistory paymentHistory = new QPaymentHistory("paymentHistory");

    public final NumberPath<Integer> amountPaid = createNumber("amountPaid", Integer.class);

    public final com.nhnacademy.bookstore.orderset.order.entity.QOrder order;

    public final StringPath paymentCode = createString("paymentCode");

    public final DateTimePath<java.time.LocalDateTime> paymentDate = createDateTime("paymentDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> paymentHistoryId = createNumber("paymentHistoryId", Long.class);

    public final com.nhnacademy.bookstore.paymentset.paymentmethod.entity.QPaymentMethod paymentMethod;

    public final com.nhnacademy.bookstore.paymentset.status.entity.QPaymentStatus paymentStatus;

    public QPaymentHistory(String variable) {
        this(PaymentHistory.class, forVariable(variable), INITS);
    }

    public QPaymentHistory(Path<? extends PaymentHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPaymentHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPaymentHistory(PathMetadata metadata, PathInits inits) {
        this(PaymentHistory.class, metadata, inits);
    }

    public QPaymentHistory(Class<? extends PaymentHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new com.nhnacademy.bookstore.orderset.order.entity.QOrder(forProperty("order"), inits.get("order")) : null;
        this.paymentMethod = inits.isInitialized("paymentMethod") ? new com.nhnacademy.bookstore.paymentset.paymentmethod.entity.QPaymentMethod(forProperty("paymentMethod")) : null;
        this.paymentStatus = inits.isInitialized("paymentStatus") ? new com.nhnacademy.bookstore.paymentset.status.entity.QPaymentStatus(forProperty("paymentStatus")) : null;
    }

}

