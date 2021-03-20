package com.xzinoviou.academia.backoffice.domain.model;

import lombok.Data;

import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Data
public class Course {

    private Long id;

    private String cin;

    private String title;

    private OffsetDateTime creationDate;

    private boolean mandatory;
}
