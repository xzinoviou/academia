package com.xzinoviou.academia.studentservice.service.jpa;

import com.xzinoviou.academia.studentservice.domain.jpa.Student;
import com.xzinoviou.academia.studentservice.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student with id : " + id + " was not found"));
    }

    @Override
    public Student getStudentBySin(String sin) {
        return studentRepository.findBySin(sin)
                .orElseThrow(() -> new RuntimeException("Student with sin : " + sin + " was not found"));
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Long getNextStudentIdSequencer() {
        return studentRepository.findLastStudentInserted().orElseGet(() -> 0L) + 1L;
    }
}
