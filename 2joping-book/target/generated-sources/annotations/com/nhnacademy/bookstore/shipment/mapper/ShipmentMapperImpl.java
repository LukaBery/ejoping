package com.nhnacademy.bookstore.shipment.mapper;

import com.nhnacademy.bookstore.orderset.order.entity.Order;
import com.nhnacademy.bookstore.shipment.dto.response.ShipmentResponseDto;
import com.nhnacademy.bookstore.shipment.entity.Carrier;
import com.nhnacademy.bookstore.shipment.entity.Shipment;
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
public class ShipmentMapperImpl implements ShipmentMapper {

    @Override
    public ShipmentResponseDto toShipmentResponseDto(Shipment shipment) {
        if ( shipment == null ) {
            return null;
        }

        Long carrierId = null;
        Long shipmentPolicyId = null;
        Long orderId = null;
        Long shipmentId = null;
        String requirement = null;
        LocalDateTime shippingDate = null;
        LocalDateTime deliveryDate = null;
        String trackingNumber = null;

        carrierId = shipmentCarrierCarrierId( shipment );
        shipmentPolicyId = shipmentShipmentPolicyShipmentPolicyId( shipment );
        orderId = shipmentOrderOrderId( shipment );
        shipmentId = shipment.getShipmentId();
        requirement = shipment.getRequirement();
        shippingDate = shipment.getShippingDate();
        deliveryDate = shipment.getDeliveryDate();
        trackingNumber = shipment.getTrackingNumber();

        ShipmentResponseDto shipmentResponseDto = new ShipmentResponseDto( shipmentId, carrierId, shipmentPolicyId, orderId, requirement, shippingDate, deliveryDate, trackingNumber );

        return shipmentResponseDto;
    }

    private Long shipmentCarrierCarrierId(Shipment shipment) {
        if ( shipment == null ) {
            return null;
        }
        Carrier carrier = shipment.getCarrier();
        if ( carrier == null ) {
            return null;
        }
        Long carrierId = carrier.getCarrierId();
        if ( carrierId == null ) {
            return null;
        }
        return carrierId;
    }

    private Long shipmentShipmentPolicyShipmentPolicyId(Shipment shipment) {
        if ( shipment == null ) {
            return null;
        }
        ShipmentPolicy shipmentPolicy = shipment.getShipmentPolicy();
        if ( shipmentPolicy == null ) {
            return null;
        }
        Long shipmentPolicyId = shipmentPolicy.getShipmentPolicyId();
        if ( shipmentPolicyId == null ) {
            return null;
        }
        return shipmentPolicyId;
    }

    private Long shipmentOrderOrderId(Shipment shipment) {
        if ( shipment == null ) {
            return null;
        }
        Order order = shipment.getOrder();
        if ( order == null ) {
            return null;
        }
        Long orderId = order.getOrderId();
        if ( orderId == null ) {
            return null;
        }
        return orderId;
    }
}
