package com.nhnacademy.bookstore.bookset.category.mapper;

import com.nhnacademy.bookstore.bookset.category.dto.response.CategoryIsActiveResponseDto;
import com.nhnacademy.bookstore.bookset.category.dto.response.CategoryResponseDto;
import com.nhnacademy.bookstore.bookset.category.entity.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-18T17:46:31+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.9 (Amazon.com Inc.)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryResponseDto toCategoryResponseDto(Category category) {
        if ( category == null ) {
            return null;
        }

        Long parentCategoryId = null;
        Long categoryId = null;
        String name = null;

        parentCategoryId = categoryParentCategoryCategoryId( category );
        categoryId = category.getCategoryId();
        name = category.getName();

        CategoryResponseDto categoryResponseDto = new CategoryResponseDto( categoryId, name, parentCategoryId );

        return categoryResponseDto;
    }

    @Override
    public CategoryIsActiveResponseDto toCategoryIsActiveResponseDto(Category category) {
        if ( category == null ) {
            return null;
        }

        Long parentCategoryId = null;
        Long categoryId = null;
        String name = null;
        Boolean isActive = null;

        parentCategoryId = categoryParentCategoryCategoryId( category );
        categoryId = category.getCategoryId();
        name = category.getName();
        isActive = category.getIsActive();

        CategoryIsActiveResponseDto categoryIsActiveResponseDto = new CategoryIsActiveResponseDto( categoryId, name, parentCategoryId, isActive );

        return categoryIsActiveResponseDto;
    }

    private Long categoryParentCategoryCategoryId(Category category) {
        if ( category == null ) {
            return null;
        }
        Category parentCategory = category.getParentCategory();
        if ( parentCategory == null ) {
            return null;
        }
        Long categoryId = parentCategory.getCategoryId();
        if ( categoryId == null ) {
            return null;
        }
        return categoryId;
    }
}
