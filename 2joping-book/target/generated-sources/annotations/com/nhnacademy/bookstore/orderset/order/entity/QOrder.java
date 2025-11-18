package com.nhnacademy.bookstore.orderset.order.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = 1205128798L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrder order = new QOrder("order1");

    public final NumberPath<Integer> couponSalePrice = createNumber("couponSalePrice", Integer.class);

    public final com.nhnacademy.bookstore.coupon.entity.member.QMemberCoupon couponUsage;

    public final com.nhnacademy.bookstore.user.customer.entity.QCustomer customer;

    public final DatePath<java.time.LocalDate> desiredDeliveryDate = createDate("desiredDeliveryDate", java.time.LocalDate.class);

    public final StringPath detailAddress = createString("detailAddress");

    public final StringPath orderCode = createString("orderCode");

    public final DateTimePath<java.time.LocalDateTime> orderDate = createDateTime("orderDate", java.time.LocalDateTime.class);

    public final ListPath<com.nhnacademy.bookstore.orderset.orderdetail.entity.OrderDetail, com.nhnacademy.bookstore.orderset.orderdetail.entity.QOrderDetail> orderDetails = this.<com.nhnacademy.bookstore.orderset.orderdetail.entity.OrderDetail, com.nhnacademy.bookstore.orderset.orderdetail.entity.QOrderDetail>createList("orderDetails", com.nhnacademy.bookstore.orderset.orderdetail.entity.OrderDetail.class, com.nhnacademy.bookstore.orderset.orderdetail.entity.QOrderDetail.class, PathInits.DIRECT2);

    public final NumberPath<Long> orderId = createNumber("orderId", Long.class);

    public final com.nhnacademy.bookstore.orderset.orderstate.entity.QOrderState orderState;

    public final NumberPath<Integer> pointUsage = createNumber("pointUsage", Integer.class);

    public final StringPath postalCode = createString("postalCode");

    public final StringPath receiver = createString("receiver");

    public final StringPath roadAddress = createString("roadAddress");

    public final NumberPath<Integer> shippingFee = createNumber("shippingFee", Integer.class);

    public final NumberPath<Integer> totalPrice = createNumber("totalPrice", Integer.class);

    public QOrder(String variable) {
        this(Order.class, forVariable(variable), INITS);
    }

    public QOrder(Path<? extends Order> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrder(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrder(PathMetadata metadata, PathInits inits) {
        this(Order.class, metadata, inits);
    }

    public QOrder(Class<? extends Order> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.couponUsage = inits.isInitialized("couponUsage") ? new com.nhnacademy.bookstore.coupon.entity.member.QMemberCoupon(forProperty("couponUsage"), inits.get("couponUsage")) : null;
        this.customer = inits.isInitialized("customer") ? new com.nhnacademy.bookstore.user.customer.entity.QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.orderState = inits.isInitialized("orderState") ? new com.nhnacademy.bookstore.orderset.orderstate.entity.QOrderState(forProperty("orderState")) : null;
    }

}

