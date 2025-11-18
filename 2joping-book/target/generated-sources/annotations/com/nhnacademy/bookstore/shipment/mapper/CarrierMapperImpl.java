package com.nhnacademy.bookstore.shipment.mapper;

import com.nhnacademy.bookstore.shipment.dto.response.CarrierResponseDto;
import com.nhnacademy.bookstore.shipment.entity.Carrier;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-18T17:46:31+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.9 (Amazon.com Inc.)"
)
@Component
public class CarrierMapperImpl implements CarrierMapper {

    @Override
    public CarrierResponseDto toCarrierResponseDto(Carrier carrier) {
        if ( carrier == null ) {
            return null;
        }

        Long carrierId = null;
        String name = null;
        String contactNumber = null;
        String contactEmail = null;
        String websiteUrl = null;

        carrierId = carrier.getCarrierId();
        name = carrier.getName();
        contactNumber = carrier.getContactNumber();
        contactEmail = carrier.getContactEmail();
        websiteUrl = carrier.getWebsiteUrl();

        CarrierResponseDto carrierResponseDto = new CarrierResponseDto( carrierId, name, contactNumber, contactEmail, websiteUrl );

        return carrierResponseDto;
    }
}
