package com.xzinoviou.academia.backoffice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultGpa implements Serializable {

    private String firstName;
    private String lastName;
    private String sin;
    private int totalCourses;
    private BigDecimal gpa;
    private int totalMandatory;
    private int totalElective;
}
