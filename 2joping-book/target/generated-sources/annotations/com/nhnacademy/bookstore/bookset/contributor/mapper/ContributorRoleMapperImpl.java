package com.nhnacademy.bookstore.bookset.contributor.mapper;

import com.nhnacademy.bookstore.bookset.contributor.dto.response.ContributorRoleResponseDto;
import com.nhnacademy.bookstore.bookset.contributor.entity.ContributorRole;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-18T17:46:31+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.9 (Amazon.com Inc.)"
)
@Component
public class ContributorRoleMapperImpl implements ContributorRoleMapper {

    @Override
    public ContributorRoleResponseDto toContributorRoleResponseDto(ContributorRole contributorRole) {
        if ( contributorRole == null ) {
            return null;
        }

        Long contributorRoleId = null;
        String name = null;

        contributorRoleId = contributorRole.getContributorRoleId();
        name = contributorRole.getName();

        ContributorRoleResponseDto contributorRoleResponseDto = new ContributorRoleResponseDto( contributorRoleId, name );

        return contributorRoleResponseDto;
    }
}
