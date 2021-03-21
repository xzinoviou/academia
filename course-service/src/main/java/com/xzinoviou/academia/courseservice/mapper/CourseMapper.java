package com.xzinoviou.academia.courseservice.mapper;

import com.xzinoviou.academia.courseservice.domain.dto.CourseDto;
import com.xzinoviou.academia.courseservice.domain.jpa.Course;
import com.xzinoviou.academia.courseservice.domain.request.CourseCreateRequest;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface CourseMapper {

    Course convertToEntity(CourseCreateRequest request);

    CourseDto mapToDto(Course course);
}
