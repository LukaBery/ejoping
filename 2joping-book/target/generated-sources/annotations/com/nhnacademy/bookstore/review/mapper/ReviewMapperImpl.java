package com.nhnacademy.bookstore.review.mapper;

import com.nhnacademy.bookstore.bookset.book.entity.Book;
import com.nhnacademy.bookstore.orderset.orderdetail.entity.OrderDetail;
import com.nhnacademy.bookstore.review.dto.response.ReviewCreateResponseDto;
import com.nhnacademy.bookstore.review.dto.response.ReviewModifyResponseDto;
import com.nhnacademy.bookstore.review.dto.response.ReviewResponseDto;
import com.nhnacademy.bookstore.review.entity.Review;
import com.nhnacademy.bookstore.user.member.entity.Member;
import java.sql.Timestamp;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-18T17:46:31+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.9 (Amazon.com Inc.)"
)
@Component
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public ReviewCreateResponseDto toCreateResponseDto(Review review) {
        if ( review == null ) {
            return null;
        }

        String reviewImage = null;
        Long reviewId = null;
        int ratingValue = 0;
        String title = null;
        String text = null;
        Timestamp createdAt = null;

        reviewImage = review.getImageUrl();
        reviewId = review.getReviewId();
        ratingValue = review.getRatingValue();
        title = review.getTitle();
        text = review.getText();
        createdAt = review.getCreatedAt();

        ReviewCreateResponseDto reviewCreateResponseDto = new ReviewCreateResponseDto( reviewId, ratingValue, title, text, reviewImage, createdAt );

        return reviewCreateResponseDto;
    }

    @Override
    public ReviewModifyResponseDto toModifyResponseDto(Review review) {
        if ( review == null ) {
            return null;
        }

        String reviewImage = null;
        Long reviewId = null;
        int ratingValue = 0;
        String title = null;
        String text = null;
        Timestamp createdAt = null;
        Timestamp updatedAt = null;

        reviewImage = review.getImageUrl();
        reviewId = review.getReviewId();
        ratingValue = review.getRatingValue();
        title = review.getTitle();
        text = review.getText();
        createdAt = review.getCreatedAt();
        updatedAt = review.getUpdatedAt();

        ReviewModifyResponseDto reviewModifyResponseDto = new ReviewModifyResponseDto( reviewId, ratingValue, title, text, reviewImage, createdAt, updatedAt );

        return reviewModifyResponseDto;
    }

    @Override
    public ReviewResponseDto toResponseDto(Review review) {
        if ( review == null ) {
            return null;
        }

        Long orderDetailId = null;
        Long customerId = null;
        Long bookId = null;
        String reviewImage = null;
        Long reviewId = null;
        int ratingValue = 0;
        String title = null;
        String text = null;
        Timestamp createdAt = null;
        Timestamp updatedAt = null;

        orderDetailId = reviewOrderDetailOrderDetailId( review );
        customerId = reviewMemberId( review );
        bookId = reviewBookBookId( review );
        reviewImage = review.getImageUrl();
        reviewId = review.getReviewId();
        ratingValue = review.getRatingValue();
        title = review.getTitle();
        text = review.getText();
        createdAt = review.getCreatedAt();
        updatedAt = review.getUpdatedAt();

        ReviewResponseDto reviewResponseDto = new ReviewResponseDto( reviewId, orderDetailId, customerId, bookId, ratingValue, title, text, reviewImage, createdAt, updatedAt );

        return reviewResponseDto;
    }

    private Long reviewOrderDetailOrderDetailId(Review review) {
        if ( review == null ) {
            return null;
        }
        OrderDetail orderDetail = review.getOrderDetail();
        if ( orderDetail == null ) {
            return null;
        }
        Long orderDetailId = orderDetail.getOrderDetailId();
        if ( orderDetailId == null ) {
            return null;
        }
        return orderDetailId;
    }

    private Long reviewMemberId(Review review) {
        if ( review == null ) {
            return null;
        }
        Member member = review.getMember();
        if ( member == null ) {
            return null;
        }
        Long id = member.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long reviewBookBookId(Review review) {
        if ( review == null ) {
            return null;
        }
        Book book = review.getBook();
        if ( book == null ) {
            return null;
        }
        Long bookId = book.getBookId();
        if ( bookId == null ) {
            return null;
        }
        return bookId;
    }
}
