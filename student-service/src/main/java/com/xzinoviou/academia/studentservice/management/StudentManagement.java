package com.xzinoviou.academia.studentservice.management;

import com.xzinoviou.academia.studentservice.domain.jpa.Student;
import com.xzinoviou.academia.studentservice.domain.request.StudentCreateRequest;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface StudentManagement {

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student getStudentBySin(String sin);

    Student saveStudent(StudentCreateRequest request);
}
