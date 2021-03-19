package com.xzinoviou.academia.studentservice.domain.request;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
