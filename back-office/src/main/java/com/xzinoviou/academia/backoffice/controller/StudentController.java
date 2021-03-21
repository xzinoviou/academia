package com.xzinoviou.academia.backoffice.controller;

import com.xzinoviou.academia.backoffice.domain.dto.StudentDto;
import com.xzinoviou.academia.backoffice.domain.request.student.StudentCreateRequest;
import com.xzinoviou.academia.backoffice.feign.StudentClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@RestController
@RequestMapping("/back-office/students")
public class StudentController {

    private final StudentClient studentClient;

    public StudentController(StudentClient studentClient) {
        this.studentClient = studentClient;
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.ok(studentClient.getAllStudents());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(studentClient.getStudentById(id));
    }

    @GetMapping("/sin/{sin}")
    public ResponseEntity<StudentDto> getStudentBySin(@PathVariable("sin") String sin) {
        return ResponseEntity.ok(studentClient.getStudentBySin(sin));
    }

    @PostMapping
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentCreateRequest request) {
        return new ResponseEntity<>(studentClient.saveStudent(request), HttpStatus.CREATED);
    }
}
