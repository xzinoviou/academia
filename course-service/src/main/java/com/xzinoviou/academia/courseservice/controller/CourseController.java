package com.xzinoviou.academia.courseservice.controller;

import com.xzinoviou.academia.courseservice.domain.dto.CourseDto;
import com.xzinoviou.academia.courseservice.domain.request.CourseCreateRequest;
import com.xzinoviou.academia.courseservice.management.CourseManagement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

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
    public ResponseEntity<List<CourseDto>> getAllCourses() {
        return ResponseEntity.ok(courseManagement.getAllCourses());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<CourseDto> getCourseById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(courseManagement.getCourseById(id));
    }

    @GetMapping("/cin/{cin}")
    public ResponseEntity<CourseDto> getCourseBySin(@PathVariable("cin") String sin) {
        return ResponseEntity.ok(courseManagement.getCourseByCin(sin));
    }

    @PostMapping
    public ResponseEntity<CourseDto> saveCourse(@RequestBody CourseCreateRequest request) {
        return new ResponseEntity<>(courseManagement.saveCourse(request), HttpStatus.CREATED);
    }

    @PostMapping("/search")
    public ResponseEntity<List<CourseDto>> getCoursesByIdIn(@RequestBody Set<Long> ids) {
        return ResponseEntity.ok(courseManagement.getCoursesByIdIn(ids));
    }
}
