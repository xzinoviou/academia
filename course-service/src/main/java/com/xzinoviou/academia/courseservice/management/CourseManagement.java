package com.xzinoviou.academia.courseservice.management;

import com.xzinoviou.academia.courseservice.domain.dto.CourseDto;
import com.xzinoviou.academia.courseservice.domain.request.CourseCreateRequest;

import java.util.List;
import java.util.Set;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface CourseManagement {

    CourseDto getCourseById(Long id);

    CourseDto getCourseByCin(String cin);

    List<CourseDto> getAllCourses();

    CourseDto saveCourse(CourseCreateRequest request);

    List<CourseDto> getCoursesByIdIn(Set<Long> ids);

}
