package com.xzinoviou.academia.backoffice.service.student;

import com.xzinoviou.academia.backoffice.domain.dto.StudentDto;
import com.xzinoviou.academia.backoffice.domain.request.student.StudentCreateRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);


    StudentDto getStudentBySin(String sin);


    StudentDto saveStudent(StudentCreateRequest request);
}
