package com.xzinoviou.academia.backoffice.domain.request.result;

import com.xzinoviou.academia.backoffice.domain.model.Semester;
import lombok.Data;
import lombok.Getter;

import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
@Data
@Getter
public class ResultUpdateRequest {

    private Long id;

    private Long studentId;

    private Long courseId;

    private Double grade;

    private OffsetDateTime examDate;

    private Semester semester;

}