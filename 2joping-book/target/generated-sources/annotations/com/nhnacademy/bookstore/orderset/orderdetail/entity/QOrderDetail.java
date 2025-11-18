package com.nhnacademy.bookstore.orderset.orderdetail.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderDetail is a Querydsl query type for OrderDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderDetail extends EntityPathBase<OrderDetail> {

    private static final long serialVersionUID = -1532702050L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderDetail orderDetail = new QOrderDetail("orderDetail");

    public final com.nhnacademy.bookstore.bookset.book.entity.QBook book;

    public final NumberPath<Integer> finalPrice = createNumber("finalPrice", Integer.class);

    public final com.nhnacademy.bookstore.orderset.order.entity.QOrder order;

    public final NumberPath<Long> orderDetailId = createNumber("orderDetailId", Long.class);

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public final NumberPath<Integer> sellPrice = createNumber("sellPrice", Integer.class);

    public QOrderDetail(String variable) {
        this(OrderDetail.class, forVariable(variable), INITS);
    }

    public QOrderDetail(Path<? extends OrderDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderDetail(PathMetadata metadata, PathInits inits) {
        this(OrderDetail.class, metadata, inits);
    }

    public QOrderDetail(Class<? extends OrderDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.book = inits.isInitialized("book") ? new com.nhnacademy.bookstore.bookset.book.entity.QBook(forProperty("book"), inits.get("book")) : null;
        this.order = inits.isInitialized("order") ? new com.nhnacademy.bookstore.orderset.order.entity.QOrder(forProperty("order"), inits.get("order")) : null;
    }

}

