package com.xzinoviou.academia.backoffice.controller;

import com.xzinoviou.academia.backoffice.domain.model.ResultGpa;
import com.xzinoviou.academia.backoffice.service.StudentAnalyticsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@RestController
@RequestMapping("/back-office/analytics")
public class AnalyticsController {
    private final StudentAnalyticsService studentAnalyticsService;

    public AnalyticsController(StudentAnalyticsService studentAnalyticsService) {
        this.studentAnalyticsService = studentAnalyticsService;
    }

    @GetMapping("/gpa/student/id/{id}")
    public ResponseEntity<ResultGpa> getGpaByStudentId(@PathVariable("id") Long id){
        return ResponseEntity.ok(studentAnalyticsService.getResultGpaByStudentId(id));
    }
}
