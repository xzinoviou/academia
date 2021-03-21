package com.xzinoviou.academia.backoffice.domain.dto;

import lombok.Getter;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
@Getter
public class StudentDto implements Serializable {

    private Long id;

    private String sin;

    private String firstName;

    private String lastName;

    private String email;

    private OffsetDateTime birthDate;

    private OffsetDateTime registrationDate;
}
