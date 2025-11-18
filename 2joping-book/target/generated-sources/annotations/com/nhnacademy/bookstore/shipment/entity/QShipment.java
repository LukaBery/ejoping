package com.nhnacademy.bookstore.shipment.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipment is a Querydsl query type for Shipment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShipment extends EntityPathBase<Shipment> {

    private static final long serialVersionUID = 49568304L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipment shipment = new QShipment("shipment");

    public final QCarrier carrier;

    public final DateTimePath<java.time.LocalDateTime> deliveryDate = createDateTime("deliveryDate", java.time.LocalDateTime.class);

    public final com.nhnacademy.bookstore.orderset.order.entity.QOrder order;

    public final StringPath requirement = createString("requirement");

    public final NumberPath<Long> shipmentId = createNumber("shipmentId", Long.class);

    public final QShipmentPolicy shipmentPolicy;

    public final DateTimePath<java.time.LocalDateTime> shippingDate = createDateTime("shippingDate", java.time.LocalDateTime.class);

    public final StringPath trackingNumber = createString("trackingNumber");

    public QShipment(String variable) {
        this(Shipment.class, forVariable(variable), INITS);
    }

    public QShipment(Path<? extends Shipment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipment(PathMetadata metadata, PathInits inits) {
        this(Shipment.class, metadata, inits);
    }

    public QShipment(Class<? extends Shipment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.carrier = inits.isInitialized("carrier") ? new QCarrier(forProperty("carrier")) : null;
        this.order = inits.isInitialized("order") ? new com.nhnacademy.bookstore.orderset.order.entity.QOrder(forProperty("order"), inits.get("order")) : null;
        this.shipmentPolicy = inits.isInitialized("shipmentPolicy") ? new QShipmentPolicy(forProperty("shipmentPolicy")) : null;
    }

}

