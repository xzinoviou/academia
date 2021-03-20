package com.xzinoviou.academia.resultservice.controller;

import com.xzinoviou.academia.resultservice.domain.jpa.Result;
import com.xzinoviou.academia.resultservice.domain.request.result.ResultCreateRequest;
import com.xzinoviou.academia.resultservice.management.ResultManagement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 15/3/21.
 */
@RestController
@RequestMapping("/results")
public class ResultController {

    private final ResultManagement resultManagement;

    public ResultController(ResultManagement resultManagement) {
        this.resultManagement = resultManagement;
    }

    @GetMapping
    public ResponseEntity<List<Result>> getAllResults() {
        return ResponseEntity.ok(resultManagement.getAllResults());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Result> getResultById(Long id) {
        return ResponseEntity.ok(resultManagement.getResultById(id));
    }

    @GetMapping("/student/id/{id}")
    public ResponseEntity<List<Result>> getResultsByStudentId(Long studentId) {
        return ResponseEntity.ok(resultManagement.getResultsByStudentId(studentId));
    }

    @GetMapping("/course/id/{id}")
    public ResponseEntity<List<Result>> getResultsByCourseId(Long courseId) {
        return ResponseEntity.ok(resultManagement.getResultsByCourseId(courseId));
    }

    @PostMapping
    public ResponseEntity<Result> saveResult(ResultCreateRequest request) {
        return new ResponseEntity<>(resultManagement.saveResult(request), HttpStatus.CREATED);
    }

}
