package com.xzinoviou.academia.backoffice.service.student;

import com.xzinoviou.academia.backoffice.domain.dto.StudentDto;
import com.xzinoviou.academia.backoffice.domain.request.student.StudentCreateRequest;
import com.xzinoviou.academia.backoffice.feign.StudentClient;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentClient studentClient;

    public StudentServiceImpl(StudentClient studentClient) {
        this.studentClient = studentClient;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return studentClient.getAllStudents();
    }

    @Override
    public StudentDto getStudentById(Long id) {
        return studentClient.getStudentById(id);
    }

    @Override
    public StudentDto getStudentBySin(String sin) {
        return studentClient.getStudentBySin(sin);
    }

    @Override
    public StudentDto saveStudent(StudentCreateRequest request) {
        return studentClient.saveStudent(request);
    }
}
