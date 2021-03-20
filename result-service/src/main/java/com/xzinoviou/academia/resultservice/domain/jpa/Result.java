package com.xzinoviou.academia.resultservice.domain.jpa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Entity
@Table(name = "RESULT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    private Long studentId;

    private Long courseId;

    @Column(name = "GRADE", precision = 4)
    private Double grade;

    @Column(name = "EXAM_DATE")
    private OffsetDateTime examDate;

    @Column(name = "SEMESTER")
    @Enumerated(value = EnumType.STRING)
    private Semester semester;

}