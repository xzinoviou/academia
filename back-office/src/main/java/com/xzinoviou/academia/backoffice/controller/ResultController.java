package com.xzinoviou.academia.backoffice.controller;

import com.xzinoviou.academia.backoffice.domain.dto.ResultDto;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultCreateRequest;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultUpdateRequest;
import com.xzinoviou.academia.backoffice.feign.ResultClient;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
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
@RequestMapping("/back-office/results")
public class ResultController {

    private final ResultClient resultClient;

    public ResultController(ResultClient resultClient) {
        this.resultClient = resultClient;
    }

    @GetMapping
    public ResponseEntity<List<ResultDto>> getAllResults() {
        return ResponseEntity.ok(resultClient.getAllResults());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<ResultDto> getResultById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(resultClient.getResultById(id));
    }

    @GetMapping("/student/id/{id}")
    @Cacheable(value = "studentResults", key = "#id")
    public ResponseEntity<List<ResultDto>> getResultsByStudentId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(resultClient.getResultsByStudentId(id));
    }

    @GetMapping("/course/id/{id}")
    public ResponseEntity<List<ResultDto>> getResultsByCourseId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(resultClient.getResultsByCourseId(id));
    }

    @PostMapping
    @CacheEvict(value = "studentResults", key = "#request.studentId")
    public ResponseEntity<ResultDto> saveResult(@RequestBody ResultCreateRequest request) {
        return new ResponseEntity<>(resultClient.saveResult(request), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ResultDto> updateResult(@RequestBody ResultUpdateRequest request) {
        return ResponseEntity.ok(resultClient.updateResult(request));
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteResultById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(resultClient.deleteResultById(id));
    }
}
