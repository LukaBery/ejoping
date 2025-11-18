package com.nhnacademy.bookstore.bookset.contributor.mapper;

import com.nhnacademy.bookstore.bookset.contributor.dto.response.ContributorIsActiveResponseDto;
import com.nhnacademy.bookstore.bookset.contributor.dto.response.ContributorResponseDto;
import com.nhnacademy.bookstore.bookset.contributor.entity.Contributor;
import com.nhnacademy.bookstore.bookset.contributor.entity.ContributorRole;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-18T17:46:31+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 21.0.9 (Amazon.com Inc.)"
)
@Component
public class ContributorMapperImpl implements ContributorMapper {

    @Override
    public ContributorResponseDto toContributorResponseDto(Contributor contributor) {
        if ( contributor == null ) {
            return null;
        }

        Long contributorRoleId = null;
        Long contributorId = null;
        String name = null;

        contributorRoleId = contributorContributorRoleContributorRoleId( contributor );
        contributorId = contributor.getContributorId();
        name = contributor.getName();

        ContributorResponseDto contributorResponseDto = new ContributorResponseDto( contributorId, contributorRoleId, name );

        return contributorResponseDto;
    }

    @Override
    public ContributorIsActiveResponseDto toContributorIsActiveResponseDto(Contributor contributor) {
        if ( contributor == null ) {
            return null;
        }

        Long contributorRoleId = null;
        Long contributorId = null;
        String name = null;
        Boolean isActive = null;

        contributorRoleId = contributorContributorRoleContributorRoleId( contributor );
        contributorId = contributor.getContributorId();
        name = contributor.getName();
        isActive = contributor.getIsActive();

        ContributorIsActiveResponseDto contributorIsActiveResponseDto = new ContributorIsActiveResponseDto( contributorId, contributorRoleId, name, isActive );

        return contributorIsActiveResponseDto;
    }

    private Long contributorContributorRoleContributorRoleId(Contributor contributor) {
        if ( contributor == null ) {
            return null;
        }
        ContributorRole contributorRole = contributor.getContributorRole();
        if ( contributorRole == null ) {
            return null;
        }
        Long contributorRoleId = contributorRole.getContributorRoleId();
        if ( contributorRoleId == null ) {
            return null;
        }
        return contributorRoleId;
    }
}
