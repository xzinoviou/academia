package com.xzinoviou.academia.studentservice.management;

import com.xzinoviou.academia.studentservice.domain.dto.StudentDto;
import com.xzinoviou.academia.studentservice.domain.jpa.Student;
import com.xzinoviou.academia.studentservice.domain.request.StudentCreateRequest;
import com.xzinoviou.academia.studentservice.mapper.StudentMapper;
import com.xzinoviou.academia.studentservice.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.xzinoviou.academia.studentservice.Constant.STUDENT_SIN_PREFIX;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Service
public class StudentManagementImpl implements StudentManagement {

    private final StudentService studentService;
    private final StudentMapper studentMapper;

    public StudentManagementImpl(StudentService studentService, StudentMapper studentMapper) {
        this.studentService = studentService;
        this.studentMapper = studentMapper;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents().stream()
                .map(studentMapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public StudentDto getStudentById(Long id) {
        return studentMapper.mapToDto(
                studentService.getStudentById(id)
        );
    }

    @Override
    public StudentDto getStudentBySin(String sin) {
        return studentMapper.mapToDto(
                studentService.getStudentBySin(sin)
        );
    }

    @Override
    public StudentDto saveStudent(StudentCreateRequest request) {
        Student student = studentMapper.convertToEntity(request);
        student.setSin(STUDENT_SIN_PREFIX + studentService.getNextStudentIdSequencer());
        return studentMapper.mapToDto(
                studentService.saveStudent(student)
        );
    }
}
