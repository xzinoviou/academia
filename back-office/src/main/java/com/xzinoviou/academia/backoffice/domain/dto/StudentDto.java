package com.xzinoviou.academia.backoffice.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
@Data
public class StudentDto implements Serializable {

    private Long id;

    private String sin;

    private String firstName;

    private String lastName;

    private String email;


    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSx")
    private OffsetDateTime birthDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSx")
    private OffsetDateTime registrationDate;
}
