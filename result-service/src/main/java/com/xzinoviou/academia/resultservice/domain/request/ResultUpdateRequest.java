package com.xzinoviou.academia.resultservice.domain.request;

import com.xzinoviou.academia.resultservice.domain.jpa.Semester;
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
