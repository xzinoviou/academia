package com.xzinoviou.academia.backoffice.controller;

import com.xzinoviou.academia.backoffice.domain.model.Course;
import com.xzinoviou.academia.backoffice.domain.request.course.CourseCreateRequest;
import com.xzinoviou.academia.backoffice.feign.CourseClient;
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
@RequestMapping("/back-office/courses")
public class CourseController {

    private final CourseClient courseClient;

    public CourseController(CourseClient courseClient) {
        this.courseClient = courseClient;
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return ResponseEntity.ok(courseClient.getAllCourses());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(courseClient.getCourseById(id));
    }

    @GetMapping("/cin/{cin}")
    public ResponseEntity<Course> getCourseBySin(@PathVariable("cin") String sin) {
        return ResponseEntity.ok(courseClient.getCourseByCin(sin));
    }

    @PostMapping
    public ResponseEntity<Course> saveCourse(@RequestBody CourseCreateRequest request) {
        return new ResponseEntity<>(courseClient.saveCourse(request), HttpStatus.CREATED);
    }
}
