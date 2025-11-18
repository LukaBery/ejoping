package com.nhnacademy.bookstore.bookset.contributor.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QContributorRole is a Querydsl query type for ContributorRole
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContributorRole extends EntityPathBase<ContributorRole> {

    private static final long serialVersionUID = -1667581747L;

    public static final QContributorRole contributorRole = new QContributorRole("contributorRole");

    public final NumberPath<Long> contributorRoleId = createNumber("contributorRoleId", Long.class);

    public final StringPath name = createString("name");

    public QContributorRole(String variable) {
        super(ContributorRole.class, forVariable(variable));
    }

    public QContributorRole(Path<? extends ContributorRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContributorRole(PathMetadata metadata) {
        super(ContributorRole.class, metadata);
    }

}

