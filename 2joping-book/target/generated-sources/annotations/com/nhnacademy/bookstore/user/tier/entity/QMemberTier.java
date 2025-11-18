package com.nhnacademy.bookstore.user.tier.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberTier is a Querydsl query type for MemberTier
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberTier extends EntityPathBase<MemberTier> {

    private static final long serialVersionUID = -40098913L;

    public static final QMemberTier memberTier = new QMemberTier("memberTier");

    public final NumberPath<Integer> accRate = createNumber("accRate", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> maxPromotion = createNumber("maxPromotion", Integer.class);

    public final NumberPath<Integer> minPromotion = createNumber("minPromotion", Integer.class);

    public final EnumPath<com.nhnacademy.bookstore.user.tier.enums.Tier> name = createEnum("name", com.nhnacademy.bookstore.user.tier.enums.Tier.class);

    public final BooleanPath status = createBoolean("status");

    public QMemberTier(String variable) {
        super(MemberTier.class, forVariable(variable));
    }

    public QMemberTier(Path<? extends MemberTier> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberTier(PathMetadata metadata) {
        super(MemberTier.class, metadata);
    }

}

