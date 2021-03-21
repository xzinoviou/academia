package com.xzinoviou.academia.backoffice.controller;

import com.xzinoviou.academia.backoffice.domain.dto.ResultDto;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultCreateRequest;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultUpdateRequest;
import com.xzinoviou.academia.backoffice.service.result.ResultService;
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

    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping
    public ResponseEntity<List<ResultDto>> getAllResults() {
        return ResponseEntity.ok(resultService.getAllResults());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<ResultDto> getResultById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(resultService.getResultById(id));
    }

    @GetMapping("/student/id/{id}")
    public ResponseEntity<List<ResultDto>> getResultsByStudentId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(resultService.getResultsByStudentId(id));
    }

    @GetMapping("/course/id/{id}")
    public ResponseEntity<List<ResultDto>> getResultsByCourseId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(resultService.getResultsByCourseId(id));
    }

    @PostMapping
    public ResponseEntity<ResultDto> saveResult(@RequestBody ResultCreateRequest request) {
        return new ResponseEntity<>(resultService.saveResult(request), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ResultDto> updateResult(@RequestBody ResultUpdateRequest request) {
        return ResponseEntity.ok(resultService.updateResult(request));
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteResultById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(resultService.deleteResultById(id));
    }
}
