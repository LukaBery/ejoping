package com.nhnacademy.bookstore.point.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPointHistory is a Querydsl query type for PointHistory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPointHistory extends EntityPathBase<PointHistory> {

    private static final long serialVersionUID = -1869876078L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPointHistory pointHistory = new QPointHistory("pointHistory");

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final NumberPath<Long> orderId = createNumber("orderId", Long.class);

    public final QPointType pointType;

    public final NumberPath<Long> pointTypeHistoryId = createNumber("pointTypeHistoryId", Long.class);

    public final NumberPath<Integer> pointVal = createNumber("pointVal", Integer.class);

    public final NumberPath<Long> refundHistoryId = createNumber("refundHistoryId", Long.class);

    public final DateTimePath<java.time.LocalDateTime> registerDate = createDateTime("registerDate", java.time.LocalDateTime.class);

    public QPointHistory(String variable) {
        this(PointHistory.class, forVariable(variable), INITS);
    }

    public QPointHistory(Path<? extends PointHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPointHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPointHistory(PathMetadata metadata, PathInits inits) {
        this(PointHistory.class, metadata, inits);
    }

    public QPointHistory(Class<? extends PointHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pointType = inits.isInitialized("pointType") ? new QPointType(forProperty("pointType")) : null;
    }

}

