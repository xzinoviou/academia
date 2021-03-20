package com.xzinoviou.academia.backoffice.controller;

import com.xzinoviou.academia.backoffice.domain.model.Result;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultCreateRequest;
import com.xzinoviou.academia.backoffice.feign.ResultClient;
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
 * Created on 20/3/21.
 */
@RestController
@RequestMapping("/back-office/results")
public class ResultController {

    private final ResultClient resultClient;

    public ResultController(ResultClient resultClient) {
        this.resultClient = resultClient;
    }

    @GetMapping
    public ResponseEntity<List<Result>> getAllResults() {
        return ResponseEntity.ok(resultClient.getAllResults());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Result> getResultById(Long id) {
        return ResponseEntity.ok(resultClient.getResultById(id));
    }

    @GetMapping("/student/id/{id}")
    public ResponseEntity<List<Result>> getResultsByStudentId(Long studentId) {
        return ResponseEntity.ok(resultClient.getResultsByStudentId(studentId));
    }

    @GetMapping("/course/id/{id}")
    public ResponseEntity<List<Result>> getResultsByCourseId(Long courseId) {
        return ResponseEntity.ok(resultClient.getResultsByCourseId(courseId));
    }

    @PostMapping
    public ResponseEntity<Result> saveResult(ResultCreateRequest request) {
        return new ResponseEntity<>(resultClient.saveResult(request), HttpStatus.CREATED);
    }
}
