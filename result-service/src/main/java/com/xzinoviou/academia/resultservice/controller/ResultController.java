package com.xzinoviou.academia.resultservice.controller;

import com.xzinoviou.academia.resultservice.domain.dto.ResultDto;
import com.xzinoviou.academia.resultservice.domain.request.ResultCreateRequest;
import com.xzinoviou.academia.resultservice.domain.request.ResultUpdateRequest;
import com.xzinoviou.academia.resultservice.management.ResultManagement;
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
@RequestMapping("/results")
public class ResultController {

    private final ResultManagement resultManagement;

    public ResultController(ResultManagement resultManagement) {
        this.resultManagement = resultManagement;
    }

    @GetMapping
    public ResponseEntity<List<ResultDto>> getAllResults() {
        return ResponseEntity.ok(resultManagement.getAllResults());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<ResultDto> getResultById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(resultManagement.getResultById(id));
    }

    @GetMapping("/student/id/{id}")
    public ResponseEntity<List<ResultDto>> getResultsByStudentId(@PathVariable("id") Long studentId) {
        return ResponseEntity.ok(resultManagement.getResultsByStudentId(studentId));
    }

    @GetMapping("/course/id/{id}")
    public ResponseEntity<List<ResultDto>> getResultsByCourseId(@PathVariable("id") Long courseId) {
        return ResponseEntity.ok(resultManagement.getResultsByCourseId(courseId));
    }

    @PostMapping
    public ResponseEntity<ResultDto> saveResult(@RequestBody ResultCreateRequest request) {
        return new ResponseEntity<>(resultManagement.saveResult(request), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ResultDto> updateResult(@RequestBody ResultUpdateRequest request) {
        return ResponseEntity.ok(resultManagement.updateResult(request));
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteResultById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(resultManagement.deleteResult(id));
    }
}
