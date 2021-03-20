package com.xzinoviou.academia.resultservice.domain.request.result;

import com.xzinoviou.academia.resultservice.domain.jpa.Semester;
import lombok.Data;
import lombok.Getter;

import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Data
@Getter
public class ResultCreateRequest {

    private Long studentId;

    private Long courseId;

    private Double grade;

    private OffsetDateTime examDate;

    private Semester semester;
}
