package com.xzinoviou.academia.backoffice.service.course;

import com.xzinoviou.academia.backoffice.domain.dto.CourseDto;
import com.xzinoviou.academia.backoffice.domain.request.course.CourseCreateRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Set;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
public interface CourseService {

    List<CourseDto> getAllCourses();

    CourseDto getCourseById(Long id);

    CourseDto getCourseByCin(String cin);

    CourseDto saveCourse(CourseCreateRequest request);

    List<CourseDto> getCoursesByIdIn(Set<Long> ids);
}
