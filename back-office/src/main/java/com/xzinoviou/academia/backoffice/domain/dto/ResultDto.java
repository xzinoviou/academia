package com.xzinoviou.academia.backoffice.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xzinoviou.academia.backoffice.domain.model.Semester;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
@Data
public class ResultDto implements Serializable {

    private Long id;

    private Long studentId;

    private Long courseId;

    private BigDecimal grade;

    //@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSx")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime examDate;

    private Semester semester;
}
