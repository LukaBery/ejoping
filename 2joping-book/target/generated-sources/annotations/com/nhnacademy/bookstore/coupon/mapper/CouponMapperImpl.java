package com.nhnacademy.bookstore.coupon.mapper;

import com.nhnacademy.bookstore.coupon.dto.response.CouponPolicyResponseDto;
import com.nhnacademy.bookstore.coupon.dto.response.CouponResponseDto;
import com.nhnacademy.bookstore.coupon.entity.Coupon;
import com.nhnacademy.bookstore.coupon.entity.CouponPolicy;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-18T17:46:31+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.9 (Amazon.com Inc.)"
)
@Component
public class CouponMapperImpl implements CouponMapper {

    @Override
    public CouponResponseDto toCouponResponseDto(Coupon coupon) {
        if ( coupon == null ) {
            return null;
        }

        CouponPolicyResponseDto couponPolicyResponseDto = null;
        String name = null;
        LocalDate createdAt = null;
        LocalDate expiredAt = null;
        Integer quantity = null;

        couponPolicyResponseDto = toResponseDto( coupon.getCouponPolicy() );
        name = coupon.getName();
        createdAt = coupon.getCreatedAt();
        expiredAt = coupon.getExpiredAt();
        quantity = coupon.getQuantity();

        Long couponId = null;

        CouponResponseDto couponResponseDto = new CouponResponseDto( couponId, name, createdAt, expiredAt, quantity, couponPolicyResponseDto );

        return couponResponseDto;
    }

    @Override
    public CouponPolicyResponseDto toResponseDto(CouponPolicy couponPolicy) {
        if ( couponPolicy == null ) {
            return null;
        }

        Long couponPolicyId = null;
        String name = null;
        String discountType = null;
        Integer discountValue = null;
        Integer usageLimit = null;
        Integer duration = null;
        String detail = null;
        Integer maxDiscount = null;

        couponPolicyId = couponPolicy.getCouponPolicyId();
        name = couponPolicy.getName();
        if ( couponPolicy.getDiscountType() != null ) {
            discountType = couponPolicy.getDiscountType().name();
        }
        discountValue = couponPolicy.getDiscountValue();
        usageLimit = couponPolicy.getUsageLimit();
        duration = couponPolicy.getDuration();
        detail = couponPolicy.getDetail();
        maxDiscount = couponPolicy.getMaxDiscount();

        CouponPolicyResponseDto couponPolicyResponseDto = new CouponPolicyResponseDto( couponPolicyId, name, discountType, discountValue, usageLimit, duration, detail, maxDiscount );

        return couponPolicyResponseDto;
    }
}
