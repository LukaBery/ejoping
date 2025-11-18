package com.nhnacademy.bookstore.shipment.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCarrier is a Querydsl query type for Carrier
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCarrier extends EntityPathBase<Carrier> {

    private static final long serialVersionUID = 849709986L;

    public static final QCarrier carrier = new QCarrier("carrier");

    public final NumberPath<Long> carrierId = createNumber("carrierId", Long.class);

    public final StringPath contactEmail = createString("contactEmail");

    public final StringPath contactNumber = createString("contactNumber");

    public final StringPath name = createString("name");

    public final StringPath websiteUrl = createString("websiteUrl");

    public QCarrier(String variable) {
        super(Carrier.class, forVariable(variable));
    }

    public QCarrier(Path<? extends Carrier> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCarrier(PathMetadata metadata) {
        super(Carrier.class, metadata);
    }

}

