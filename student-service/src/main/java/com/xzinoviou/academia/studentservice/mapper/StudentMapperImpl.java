package com.xzinoviou.academia.studentservice.mapper;

import com.xzinoviou.academia.studentservice.domain.dto.StudentDto;
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
public class StudentMapperImpl implements StudentMapper {

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

    @Override
    public StudentDto mapToDto(Student student) {
        return StudentDto.builder()
                .id(student.getId())
                .sin(student.getSin())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .email(student.getEmail())
                .registrationDate(student.getRegistrationDate())
                .birthDate(student.getBirthDate())
                .build();
    }
}
