package com.xzinoviou.academia.studentservice.controller;

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

    private final StudentManagement studentManager;

    public StudentController(StudentManagement studentManager) {
        this.studentManager = studentManager;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentManager.getAllStudents());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(studentManager.getStudentById(id));
    }

    @GetMapping("/sin/{sin}")
    public ResponseEntity<Student> getStudentBySin(@PathVariable("sin") String sin) {
        return ResponseEntity.ok(studentManager.getStudentBySin(sin));
    }

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody StudentCreateRequest request) {
        return new ResponseEntity<>(studentManager.saveStudent(request), HttpStatus.CREATED);
    }

}
