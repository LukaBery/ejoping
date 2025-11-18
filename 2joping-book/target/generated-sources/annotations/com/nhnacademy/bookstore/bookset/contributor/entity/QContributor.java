package com.nhnacademy.bookstore.bookset.contributor.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QContributor is a Querydsl query type for Contributor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContributor extends EntityPathBase<Contributor> {

    private static final long serialVersionUID = -546015305L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QContributor contributor = new QContributor("contributor");

    public final NumberPath<Long> contributorId = createNumber("contributorId", Long.class);

    public final QContributorRole contributorRole;

    public final BooleanPath isActive = createBoolean("isActive");

    public final StringPath name = createString("name");

    public QContributor(String variable) {
        this(Contributor.class, forVariable(variable), INITS);
    }

    public QContributor(Path<? extends Contributor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QContributor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QContributor(PathMetadata metadata, PathInits inits) {
        this(Contributor.class, metadata, inits);
    }

    public QContributor(Class<? extends Contributor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contributorRole = inits.isInitialized("contributorRole") ? new QContributorRole(forProperty("contributorRole")) : null;
    }

}

