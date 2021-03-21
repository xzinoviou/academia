package com.xzinoviou.academia.resultservice.domain.dto;

import com.xzinoviou.academia.resultservice.domain.jpa.Semester;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultDto {

    private Long id;

    private Long studentId;

    private Long courseId;

    private Double grade;

    private OffsetDateTime examDate;

    private Semester semester;
}
