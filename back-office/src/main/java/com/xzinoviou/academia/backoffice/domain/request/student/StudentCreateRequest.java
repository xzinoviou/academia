package com.xzinoviou.academia.backoffice.domain.request.student;

import lombok.Data;
import lombok.Getter;

import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Data
@Getter
public class StudentCreateRequest {

    private String firstName;

    private String lastName;

    private String email;

    private OffsetDateTime birthDate;

}
