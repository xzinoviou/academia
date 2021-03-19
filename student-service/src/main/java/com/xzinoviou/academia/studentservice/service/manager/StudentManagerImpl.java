package com.xzinoviou.academia.studentservice.service.manager;

import com.xzinoviou.academia.studentservice.domain.jpa.Student;
import com.xzinoviou.academia.studentservice.domain.request.StudentCreateRequest;
import com.xzinoviou.academia.studentservice.mapper.EntityMapper;
import com.xzinoviou.academia.studentservice.service.jpa.StudentService;
import org.springframework.stereotype.Service;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Service
public class StudentManagerImpl implements StudentManager {

    private final StudentService studentService;
    private final EntityMapper studentMapper;

    public StudentManagerImpl(StudentService studentService, EntityMapper studentMapper) {
        this.studentService = studentService;
        this.studentMapper = studentMapper;
    }

    @Override
    public Student saveStudent(StudentCreateRequest request) {
        Student student = studentMapper.convertToEntity(request);
        student.setSin("STU-" + studentService.getNextStudentIdSequencer());
        return studentService.saveStudent(student);
    }
}
