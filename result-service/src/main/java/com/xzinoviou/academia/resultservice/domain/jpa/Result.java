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

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RESULT", schema = "academia_result_schema")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESULT_ID_SEQ")
    @SequenceGenerator(name = "RESULT_ID_SEQ", sequenceName = "RESULT_ID_SEQ",
            schema = "academia_result_schema", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "COURSE_ID")
    private Long courseId;

    @Column(name = "GRADE",precision = 4)
    private BigDecimal grade;

    @Column(name = "EXAM_DATE",columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime examDate;

    @Column(name = "SEMESTER")
    @Enumerated(value = EnumType.STRING)
    private Semester semester;

}