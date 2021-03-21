package com.xzinoviou.academia.studentservice.domain.jpa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 19/3/21.
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "STUDENT",schema = "academia_student_schema")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STUDENT_ID_SEQ")
    @SequenceGenerator(name = "STUDENT_ID_SEQ", sequenceName = "STUDENT_ID_SEQ",
            schema = "academia_student_schema",allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "STUDENT_IDENTIFICATION_NUMBER", nullable = false, unique = true, length = 15)
    private String sin;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", length = 50)
    private String lastName;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "BIRTH_DATE", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime birthDate;

    @Column(name = "REGISTRATION_DATE", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime registrationDate;

}