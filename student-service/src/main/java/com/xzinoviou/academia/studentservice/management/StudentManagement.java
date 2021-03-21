package com.xzinoviou.academia.studentservice.management;

import com.xzinoviou.academia.studentservice.domain.dto.StudentDto;
import com.xzinoviou.academia.studentservice.domain.jpa.Student;
import com.xzinoviou.academia.studentservice.domain.request.StudentCreateRequest;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface StudentManagement {

    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto getStudentBySin(String sin);

    StudentDto saveStudent(StudentCreateRequest request);
}
