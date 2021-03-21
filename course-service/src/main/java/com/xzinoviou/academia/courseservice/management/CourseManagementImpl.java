package com.xzinoviou.academia.courseservice.management;

import com.xzinoviou.academia.courseservice.domain.dto.CourseDto;
import com.xzinoviou.academia.courseservice.domain.jpa.Course;
import com.xzinoviou.academia.courseservice.domain.request.CourseCreateRequest;
import com.xzinoviou.academia.courseservice.mapper.CourseMapper;
import com.xzinoviou.academia.courseservice.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Service
public class CourseManagementImpl implements CourseManagement {

    private final CourseService courseService;
    private final CourseMapper courseMapper;

    public CourseManagementImpl(CourseService courseService, CourseMapper courseMapper) {
        this.courseService = courseService;
        this.courseMapper = courseMapper;
    }

    @Override
    public CourseDto getCourseById(Long id) {
        return courseMapper.mapToDto(
                courseService.getCourseById(id)
        );
    }

    @Override
    public CourseDto getCourseByCin(String cin) {
        return courseMapper.mapToDto(courseService.getCourseByCin(cin));
    }

    @Override
    public List<CourseDto> getAllCourses() {
        return courseService.getAllCourses().stream()
                .map(courseMapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public CourseDto saveCourse(CourseCreateRequest request) {
        Course course = courseMapper.convertToEntity(request);
        course.setCin("COU-" + courseService.getNextCourseIdSequencer());
        return courseMapper.mapToDto(courseService.saveCourse(course));
    }

    @Override
    public List<CourseDto> getCoursesByIdIn(Set<Long> ids) {
        return courseService.getCoursesByIdIn(ids).stream()
                .map(courseMapper::mapToDto).collect(Collectors.toList());
    }
}
