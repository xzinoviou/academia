package com.xzinoviou.academia.resultservice.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xzinoviou.academia.resultservice.domain.jpa.Semester;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
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

    private BigDecimal grade;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime examDate;

    private Semester semester;
}
