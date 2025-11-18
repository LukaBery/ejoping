package com.nhnacademy.bookstore.shipment.mapper;

import com.nhnacademy.bookstore.shipment.dto.response.ShipmentPolicyResponseDto;
import com.nhnacademy.bookstore.shipment.entity.ShipmentPolicy;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-18T17:46:31+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.9 (Amazon.com Inc.)"
)
@Component
public class ShipmentPolicyMapperImpl implements ShipmentPolicyMapper {

    @Override
    public ShipmentPolicyResponseDto toShipmentPolicyResponseDto(ShipmentPolicy shipmentPolicy) {
        if ( shipmentPolicy == null ) {
            return null;
        }

        Long shipmentPolicyId = null;
        String name = null;
        Integer minOrderAmount = null;
        Boolean isMemberOnly = null;
        LocalDateTime createdAt = null;
        LocalDateTime updatedAt = null;
        Integer shippingFee = null;
        Boolean isActive = null;

        shipmentPolicyId = shipmentPolicy.getShipmentPolicyId();
        name = shipmentPolicy.getName();
        minOrderAmount = shipmentPolicy.getMinOrderAmount();
        isMemberOnly = shipmentPolicy.getIsMemberOnly();
        createdAt = shipmentPolicy.getCreatedAt();
        updatedAt = shipmentPolicy.getUpdatedAt();
        shippingFee = shipmentPolicy.getShippingFee();
        isActive = shipmentPolicy.getIsActive();

        ShipmentPolicyResponseDto shipmentPolicyResponseDto = new ShipmentPolicyResponseDto( shipmentPolicyId, name, minOrderAmount, isMemberOnly, createdAt, updatedAt, shippingFee, isActive );

        return shipmentPolicyResponseDto;
    }
}
