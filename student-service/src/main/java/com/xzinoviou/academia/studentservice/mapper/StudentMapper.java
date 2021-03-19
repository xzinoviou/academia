package com.xzinoviou.academia.studentservice.mapper;

import com.xzinoviou.academia.studentservice.domain.jpa.Student;
import com.xzinoviou.academia.studentservice.domain.request.StudentCreateRequest;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Component
public class StudentMapper implements EntityMapper {

    @Override
    public Student convertToEntity(StudentCreateRequest request) {
        return Student.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .registrationDate(OffsetDateTime.now())
                .birthDate(request.getBirthDate())
                .build();
    }
}
