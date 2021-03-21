package com.xzinoviou.academia.studentservice.mapper;

import com.xzinoviou.academia.studentservice.domain.dto.StudentDto;
import com.xzinoviou.academia.studentservice.domain.jpa.Student;
import com.xzinoviou.academia.studentservice.domain.request.StudentCreateRequest;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface StudentMapper {

    Student convertToEntity(StudentCreateRequest request);

    StudentDto mapToDto(Student student);
}
