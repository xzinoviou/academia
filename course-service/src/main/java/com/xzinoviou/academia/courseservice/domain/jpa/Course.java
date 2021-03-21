package com.xzinoviou.academia.courseservice.domain.jpa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Entity
@Table(name = "COURSE", schema = "academia_course_schema")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COURSE_ID_SEQ")
    @SequenceGenerator(name = "COURSE_ID_SEQ", sequenceName = "COURSE_ID_SEQ",
            schema = "academia_course_schema", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "COURSE_IDENTIFICATION_NUMBER", nullable = false, unique = true, length = 15)
    private String cin;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CREATION_DATE", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime creationDate;

    @Column(name = "MANDATORY")
    private boolean mandatory;

}