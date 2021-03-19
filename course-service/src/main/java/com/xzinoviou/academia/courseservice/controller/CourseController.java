package com.xzinoviou.academia.courseservice.controller;

import com.xzinoviou.academia.courseservice.domain.jpa.Course;
import com.xzinoviou.academia.courseservice.domain.request.CourseCreateRequest;
import com.xzinoviou.academia.courseservice.manager.CourseManager;
import com.xzinoviou.academia.courseservice.service.CourseService;
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

    private final CourseService courseService;
    private final CourseManager courseManager;

    public CourseController(CourseService courseService, CourseManager courseManager) {
        this.courseService = courseService;
        this.courseManager = courseManager;
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return ResponseEntity.ok(courseService.getAllCourses());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(courseService.getCourseById(id));
    }

    @GetMapping("/cin/{cin}")
    public ResponseEntity<Course> getCourseBySin(@PathVariable("cin") String sin) {
        return ResponseEntity.ok(courseService.getCourseByCin(sin));
    }

    @PostMapping
    public ResponseEntity<Course> saveCourse(@RequestBody CourseCreateRequest request) {
        return new ResponseEntity<>(courseManager.saveCourse(request), HttpStatus.CREATED);
    }
}
