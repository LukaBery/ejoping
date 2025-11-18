package com.nhnacademy.bookstore.point.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPointType is a Querydsl query type for PointType
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPointType extends EntityPathBase<PointType> {

    private static final long serialVersionUID = 248426492L;

    public static final QPointType pointType = new QPointType("pointType");

    public final NumberPath<Integer> accVal = createNumber("accVal", Integer.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final StringPath name = createString("name");

    public final NumberPath<Long> pointTypeId = createNumber("pointTypeId", Long.class);

    public final EnumPath<com.nhnacademy.bookstore.point.enums.PointTypeEnum> type = createEnum("type", com.nhnacademy.bookstore.point.enums.PointTypeEnum.class);

    public QPointType(String variable) {
        super(PointType.class, forVariable(variable));
    }

    public QPointType(Path<? extends PointType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPointType(PathMetadata metadata) {
        super(PointType.class, metadata);
    }

}

