package com.nhnacademy.bookstore.paymentset.paymentmethod.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPaymentMethod is a Querydsl query type for PaymentMethod
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPaymentMethod extends EntityPathBase<PaymentMethod> {

    private static final long serialVersionUID = -1960116842L;

    public static final QPaymentMethod paymentMethod = new QPaymentMethod("paymentMethod");

    public final NumberPath<Long> paymentMethodId = createNumber("paymentMethodId", Long.class);

    public final EnumPath<com.nhnacademy.bookstore.paymentset.paymentmethod.enums.PaymentMethodType> paymentMethodType = createEnum("paymentMethodType", com.nhnacademy.bookstore.paymentset.paymentmethod.enums.PaymentMethodType.class);

    public QPaymentMethod(String variable) {
        super(PaymentMethod.class, forVariable(variable));
    }

    public QPaymentMethod(Path<? extends PaymentMethod> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPaymentMethod(PathMetadata metadata) {
        super(PaymentMethod.class, metadata);
    }

}

