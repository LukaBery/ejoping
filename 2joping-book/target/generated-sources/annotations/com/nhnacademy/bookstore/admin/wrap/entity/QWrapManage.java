package com.nhnacademy.bookstore.admin.wrap.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWrapManage is a Querydsl query type for WrapManage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWrapManage extends EntityPathBase<WrapManage> {

    private static final long serialVersionUID = -740128300L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWrapManage wrapManage = new QWrapManage("wrapManage");

    public final com.nhnacademy.bookstore.orderset.orderdetail.entity.QOrderDetail orderDetail;

    public final QWrap wrap;

    public final NumberPath<Long> wrapManageId = createNumber("wrapManageId", Long.class);

    public QWrapManage(String variable) {
        this(WrapManage.class, forVariable(variable), INITS);
    }

    public QWrapManage(Path<? extends WrapManage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWrapManage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWrapManage(PathMetadata metadata, PathInits inits) {
        this(WrapManage.class, metadata, inits);
    }

    public QWrapManage(Class<? extends WrapManage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.orderDetail = inits.isInitialized("orderDetail") ? new com.nhnacademy.bookstore.orderset.orderdetail.entity.QOrderDetail(forProperty("orderDetail"), inits.get("orderDetail")) : null;
        this.wrap = inits.isInitialized("wrap") ? new QWrap(forProperty("wrap")) : null;
    }

}

