package com.xzinoviou.academia.studentservice.management;

import com.xzinoviou.academia.studentservice.domain.jpa.Student;
import com.xzinoviou.academia.studentservice.domain.request.StudentCreateRequest;
import com.xzinoviou.academia.studentservice.mapper.EntityMapper;
import com.xzinoviou.academia.studentservice.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Service
public class StudentManagementImpl implements StudentManagement {

    private final StudentService studentService;
    private final EntityMapper studentMapper;

    public StudentManagementImpl(StudentService studentService, EntityMapper studentMapper) {
        this.studentService = studentService;
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentService.getStudentById(id);
    }

    @Override
    public Student getStudentBySin(String sin) {
        return studentService.getStudentBySin(sin);
    }

    @Override
    public Student saveStudent(StudentCreateRequest request) {
        Student student = studentMapper.convertToEntity(request);
        student.setSin("STU-" + studentService.getNextStudentIdSequencer());
        return studentService.saveStudent(student);
    }
}
