package com.nhnacademy.bookstore.orderset.orderstate.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrderState is a Querydsl query type for OrderState
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderState extends EntityPathBase<OrderState> {

    private static final long serialVersionUID = 1161044574L;

    public static final QOrderState orderState = new QOrderState("orderState");

    public final EnumPath<com.nhnacademy.bookstore.orderset.orderstate.entity.vo.OrderStateType> name = createEnum("name", com.nhnacademy.bookstore.orderset.orderstate.entity.vo.OrderStateType.class);

    public final NumberPath<Long> orderStateId = createNumber("orderStateId", Long.class);

    public QOrderState(String variable) {
        super(OrderState.class, forVariable(variable));
    }

    public QOrderState(Path<? extends OrderState> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderState(PathMetadata metadata) {
        super(OrderState.class, metadata);
    }

}

