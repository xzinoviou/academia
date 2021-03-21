package com.xzinoviou.academia.backoffice.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
@Data
public class CourseDto implements Serializable {

    private Long id;

    private String cin;

    private String title;

    //@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSx")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime creationDate;

    private boolean mandatory;
}
