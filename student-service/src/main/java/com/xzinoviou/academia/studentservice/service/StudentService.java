package com.xzinoviou.academia.studentservice.service;

import com.xzinoviou.academia.studentservice.domain.jpa.Student;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface StudentService {

    Student getStudentById(Long id);

    Student getStudentBySin(String sin);

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Long getNextStudentIdSequencer();
}
