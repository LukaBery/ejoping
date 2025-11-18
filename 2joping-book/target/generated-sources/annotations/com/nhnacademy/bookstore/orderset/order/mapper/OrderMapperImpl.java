package com.nhnacademy.bookstore.orderset.order.mapper;

import com.nhnacademy.bookstore.coupon.entity.Coupon;
import com.nhnacademy.bookstore.coupon.entity.member.MemberCoupon;
import com.nhnacademy.bookstore.orderset.order.dto.OrderListResponseDto;
import com.nhnacademy.bookstore.orderset.order.entity.Order;
import com.nhnacademy.bookstore.orderset.orderstate.entity.OrderState;
import com.nhnacademy.bookstore.user.customer.entity.Customer;
import java.time.LocalDate;
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
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderListResponseDto toOrderResponseDto(Order order) {
        if ( order == null ) {
            return null;
        }

        int orderStateId = 0;
        Long orderId = null;
        String customerName = null;
        String couponName = null;
        String receiver = null;
        String postalCode = null;
        String roadAddress = null;
        String detailAddress = null;
        Integer pointUsage = null;
        Integer shippingFee = null;
        Integer couponSalePrice = null;
        Integer totalPrice = null;
        LocalDate desiredDeliveryDate = null;

        Long orderStateId1 = orderOrderStateOrderStateId( order );
        if ( orderStateId1 != null ) {
            orderStateId = orderStateId1.intValue();
        }
        orderId = order.getOrderId();
        customerName = orderCustomerName( order );
        couponName = orderCouponUsageCouponName( order );
        receiver = order.getReceiver();
        postalCode = order.getPostalCode();
        roadAddress = order.getRoadAddress();
        detailAddress = order.getDetailAddress();
        pointUsage = order.getPointUsage();
        shippingFee = order.getShippingFee();
        couponSalePrice = order.getCouponSalePrice();
        totalPrice = order.getTotalPrice();
        desiredDeliveryDate = order.getDesiredDeliveryDate();

        OrderListResponseDto orderListResponseDto = new OrderListResponseDto( orderId, orderStateId, customerName, couponName, receiver, postalCode, roadAddress, detailAddress, pointUsage, shippingFee, couponSalePrice, totalPrice, desiredDeliveryDate );

        return orderListResponseDto;
    }

    @Override
    public List<OrderListResponseDto> toOrderListResponseDto(List<Order> orderList) {
        if ( orderList == null ) {
            return null;
        }

        List<OrderListResponseDto> list = new ArrayList<OrderListResponseDto>( orderList.size() );
        for ( Order order : orderList ) {
            list.add( toOrderResponseDto( order ) );
        }

        return list;
    }

    private Long orderOrderStateOrderStateId(Order order) {
        if ( order == null ) {
            return null;
        }
        OrderState orderState = order.getOrderState();
        if ( orderState == null ) {
            return null;
        }
        Long orderStateId = orderState.getOrderStateId();
        if ( orderStateId == null ) {
            return null;
        }
        return orderStateId;
    }

    private String orderCustomerName(Order order) {
        if ( order == null ) {
            return null;
        }
        Customer customer = order.getCustomer();
        if ( customer == null ) {
            return null;
        }
        String name = customer.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String orderCouponUsageCouponName(Order order) {
        if ( order == null ) {
            return null;
        }
        MemberCoupon couponUsage = order.getCouponUsage();
        if ( couponUsage == null ) {
            return null;
        }
        Coupon coupon = couponUsage.getCoupon();
        if ( coupon == null ) {
            return null;
        }
        String name = coupon.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
