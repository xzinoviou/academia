package com.xzinoviou.academia.courseservice.controller;

import com.xzinoviou.academia.courseservice.domain.jpa.Course;
import com.xzinoviou.academia.courseservice.domain.request.CourseCreateRequest;
import com.xzinoviou.academia.courseservice.management.CourseManagement;
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
@RequestMapping("/courses")
public class CourseController {

    private final CourseManagement courseManagement;

    public CourseController(CourseManagement courseManagement) {
        this.courseManagement = courseManagement;
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return ResponseEntity.ok(courseManagement.getAllCourses());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(courseManagement.getCourseById(id));
    }

    @GetMapping("/cin/{cin}")
    public ResponseEntity<Course> getCourseBySin(@PathVariable("cin") String sin) {
        return ResponseEntity.ok(courseManagement.getCourseByCin(sin));
    }

    @PostMapping
    public ResponseEntity<Course> saveCourse(@RequestBody CourseCreateRequest request) {
        return new ResponseEntity<>(courseManagement.saveCourse(request), HttpStatus.CREATED);
    }
}
