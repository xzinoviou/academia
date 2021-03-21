package com.xzinoviou.academia.backoffice.domain.dto;

import com.xzinoviou.academia.backoffice.domain.model.Semester;
import lombok.*;

import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
@Getter
public class ResultDto {

    private Long id;

    private Long studentId;

    private Long courseId;

    private Double grade;

    private OffsetDateTime examDate;

    private Semester semester;
}
