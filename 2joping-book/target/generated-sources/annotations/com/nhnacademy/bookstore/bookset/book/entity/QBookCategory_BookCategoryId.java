package com.nhnacademy.bookstore.bookset.book.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBookCategory_BookCategoryId is a Querydsl query type for BookCategoryId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QBookCategory_BookCategoryId extends BeanPath<BookCategory.BookCategoryId> {

    private static final long serialVersionUID = 1610377167L;

    public static final QBookCategory_BookCategoryId bookCategoryId = new QBookCategory_BookCategoryId("bookCategoryId");

    public final NumberPath<Long> bookId = createNumber("bookId", Long.class);

    public final NumberPath<Long> categoryId = createNumber("categoryId", Long.class);

    public QBookCategory_BookCategoryId(String variable) {
        super(BookCategory.BookCategoryId.class, forVariable(variable));
    }

    public QBookCategory_BookCategoryId(Path<? extends BookCategory.BookCategoryId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBookCategory_BookCategoryId(PathMetadata metadata) {
        super(BookCategory.BookCategoryId.class, metadata);
    }

}

