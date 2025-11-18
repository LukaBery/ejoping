package com.nhnacademy.bookstore.paymentset.status.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPaymentStatus is a Querydsl query type for PaymentStatus
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPaymentStatus extends EntityPathBase<PaymentStatus> {

    private static final long serialVersionUID = 1511607734L;

    public static final QPaymentStatus paymentStatus = new QPaymentStatus("paymentStatus");

    public final NumberPath<Long> statusId = createNumber("statusId", Long.class);

    public final EnumPath<com.nhnacademy.bookstore.paymentset.status.enums.PaymentStatusType> statusType = createEnum("statusType", com.nhnacademy.bookstore.paymentset.status.enums.PaymentStatusType.class);

    public QPaymentStatus(String variable) {
        super(PaymentStatus.class, forVariable(variable));
    }

    public QPaymentStatus(Path<? extends PaymentStatus> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPaymentStatus(PathMetadata metadata) {
        super(PaymentStatus.class, metadata);
    }

}

