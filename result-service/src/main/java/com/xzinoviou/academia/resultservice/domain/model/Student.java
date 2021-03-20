package com.xzinoviou.academia.resultservice.domain.model;

import lombok.Data;

import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Data
public class Student {

    private Long id;

    private String sin;

    private String firstName;

    private String lastName;

    private String email;

    private OffsetDateTime birthDate;

    private OffsetDateTime registrationDate;
}
