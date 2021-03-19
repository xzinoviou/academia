package com.xzinoviou.academia.studentservice.domain.jpa;

import lombok.*;

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
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "STUDENT_IDENTIFICATION_NUMBER", nullable = false, unique = true, length = 15)
    private String sin;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", length = 50)
    private String lastName;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "BIRTH_DATE")
    private OffsetDateTime birthDate;

    @Column(name = "REGISTRATION_DATE")
    private OffsetDateTime registrationDate;

}