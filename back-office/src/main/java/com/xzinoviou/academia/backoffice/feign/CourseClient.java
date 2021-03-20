package com.xzinoviou.academia.backoffice.feign;

import com.xzinoviou.academia.backoffice.domain.model.Course;
import com.xzinoviou.academia.backoffice.domain.request.course.CourseCreateRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@FeignClient("courseservice")
public interface CourseClient {

    @GetMapping("/courses")
    List<Course> getAllCourses();

    @GetMapping("/courses/id/{id}")
    Course getCourseById(@PathVariable("id") Long id);

    @GetMapping("/courses/cin/{cin}")
    Course getCourseByCin(@PathVariable("cin") String cin);

    @PostMapping("/courses")
    Course saveCourse(@RequestBody CourseCreateRequest request);
}
