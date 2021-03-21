package com.xzinoviou.academia.studentservice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
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
public class StudentDto implements Serializable {

    private Long id;

    private String sin;

    private String firstName;

    private String lastName;

    private String email;

    private OffsetDateTime birthDate;

    private OffsetDateTime registrationDate;
}
