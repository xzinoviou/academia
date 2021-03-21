package com.xzinoviou.academia.studentservice.controller;

import com.xzinoviou.academia.studentservice.domain.dto.StudentDto;
import com.xzinoviou.academia.studentservice.domain.jpa.Student;
import com.xzinoviou.academia.studentservice.domain.request.StudentCreateRequest;
import com.xzinoviou.academia.studentservice.management.StudentManagement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 15/3/21.
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentManagement studentManagement;

    public StudentController(StudentManagement studentManagement) {
        this.studentManagement = studentManagement;
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.ok(studentManagement.getAllStudents());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(studentManagement.getStudentById(id));
    }

    @GetMapping("/sin/{sin}")
    public ResponseEntity<StudentDto> getStudentBySin(@PathVariable("sin") String sin) {
        return ResponseEntity.ok(studentManagement.getStudentBySin(sin));
    }

    @PostMapping
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentCreateRequest request) {
        return new ResponseEntity<>(studentManagement.saveStudent(request), HttpStatus.CREATED);
    }

}
