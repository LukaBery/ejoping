package com.nhnacademy.bookstore.shipment.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QShipmentPolicy is a Querydsl query type for ShipmentPolicy
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShipmentPolicy extends EntityPathBase<ShipmentPolicy> {

    private static final long serialVersionUID = 1724286850L;

    public static final QShipmentPolicy shipmentPolicy = new QShipmentPolicy("shipmentPolicy");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final BooleanPath isMemberOnly = createBoolean("isMemberOnly");

    public final NumberPath<Integer> minOrderAmount = createNumber("minOrderAmount", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> shipmentPolicyId = createNumber("shipmentPolicyId", Long.class);

    public final NumberPath<Integer> shippingFee = createNumber("shippingFee", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QShipmentPolicy(String variable) {
        super(ShipmentPolicy.class, forVariable(variable));
    }

    public QShipmentPolicy(Path<? extends ShipmentPolicy> path) {
        super(path.getType(), path.getMetadata());
    }

    public QShipmentPolicy(PathMetadata metadata) {
        super(ShipmentPolicy.class, metadata);
    }

}

