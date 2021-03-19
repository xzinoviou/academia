package com.xzinoviou.academia.courseservice.manager;

import com.xzinoviou.academia.courseservice.domain.jpa.Course;
import com.xzinoviou.academia.courseservice.domain.request.CourseCreateRequest;
import com.xzinoviou.academia.courseservice.mapper.CourseMapper;
import com.xzinoviou.academia.courseservice.service.CourseService;
import org.springframework.stereotype.Service;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Service
public class CourseManagerImpl implements CourseManager {

    private final CourseService courseService;
    private final CourseMapper courseMapper;

    public CourseManagerImpl(CourseService courseService, CourseMapper courseMapper) {
        this.courseService = courseService;
        this.courseMapper = courseMapper;
    }

    @Override
    public Course saveCourse(CourseCreateRequest request) {
        Course course = courseMapper.convertToEntity(request);
        course.setCin("COU-" + courseService.getNextCourseIdSequencer());
        return courseService.saveCourse(course);
    }
}
