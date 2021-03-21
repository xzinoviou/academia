package com.xzinoviou.academia.backoffice.feign;

import com.xzinoviou.academia.backoffice.domain.dto.CourseDto;
import com.xzinoviou.academia.backoffice.domain.request.course.CourseCreateRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Set;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@FeignClient(name = "courseservice", path = "/courses")
public interface CourseClient {

    @GetMapping
    List<CourseDto> getAllCourses();

    @GetMapping("/id/{id}")
    CourseDto getCourseById(@PathVariable("id") Long id);

    @GetMapping("/cin/{cin}")
    CourseDto getCourseByCin(@PathVariable("cin") String cin);

    @PostMapping
    CourseDto saveCourse(@RequestBody CourseCreateRequest request);

    @PostMapping("/search")
    List<CourseDto> getCoursesByIdIn(@RequestBody Set<Long> ids);
}
