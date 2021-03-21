package com.xzinoviou.academia.backoffice.domain.dto;

import lombok.Getter;

import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
@Getter
public class CourseDto {

    private Long id;

    private String cin;

    private String title;

    private OffsetDateTime creationDate;

    private boolean mandatory;
}
