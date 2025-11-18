package com.nhnacademy.bookstore.cart.mapper;

import com.nhnacademy.bookstore.bookset.book.entity.Book;
import com.nhnacademy.bookstore.cart.dto.CartResponseDto;
import com.nhnacademy.bookstore.cart.entity.Cart;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-18T17:46:31+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.9 (Amazon.com Inc.)"
)
@Component
public class CartMapperImpl implements CartMapper {

    @Override
    public CartResponseDto toCartResponseDto(Cart cart) {
        if ( cart == null ) {
            return null;
        }

        long bookId = 0L;
        String title = null;
        long sellingPrice = 0L;
        int quantity = 0;

        Long bookId1 = cartBookBookId( cart );
        if ( bookId1 != null ) {
            bookId = bookId1;
        }
        title = cartBookTitle( cart );
        sellingPrice = cartBookSellingPrice( cart );
        quantity = cart.getQuantity();

        CartResponseDto cartResponseDto = new CartResponseDto( bookId, title, sellingPrice, quantity );

        return cartResponseDto;
    }

    @Override
    public List<CartResponseDto> toCartResponseDtoList(List<Cart> cartList) {
        if ( cartList == null ) {
            return null;
        }

        List<CartResponseDto> list = new ArrayList<CartResponseDto>( cartList.size() );
        for ( Cart cart : cartList ) {
            list.add( toCartResponseDto( cart ) );
        }

        return list;
    }

    private Long cartBookBookId(Cart cart) {
        if ( cart == null ) {
            return null;
        }
        Book book = cart.getBook();
        if ( book == null ) {
            return null;
        }
        Long bookId = book.getBookId();
        if ( bookId == null ) {
            return null;
        }
        return bookId;
    }

    private String cartBookTitle(Cart cart) {
        if ( cart == null ) {
            return null;
        }
        Book book = cart.getBook();
        if ( book == null ) {
            return null;
        }
        String title = book.getTitle();
        if ( title == null ) {
            return null;
        }
        return title;
    }

    private int cartBookSellingPrice(Cart cart) {
        if ( cart == null ) {
            return 0;
        }
        Book book = cart.getBook();
        if ( book == null ) {
            return 0;
        }
        int sellingPrice = book.getSellingPrice();
        return sellingPrice;
    }
}
