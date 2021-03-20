package com.xzinoviou.academia.courseservice.management;

import com.xzinoviou.academia.courseservice.domain.jpa.Course;
import com.xzinoviou.academia.courseservice.domain.request.CourseCreateRequest;
import com.xzinoviou.academia.courseservice.mapper.CourseMapper;
import com.xzinoviou.academia.courseservice.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Course getCourseById(Long id) {
        return courseService.getCourseById(id);
    }

    @Override
    public Course getCourseByCin(String cin) {
        return courseService.getCourseByCin(cin);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @Override
    public Course saveCourse(CourseCreateRequest request) {
        Course course = courseMapper.convertToEntity(request);
        course.setCin("COU-" + courseService.getNextCourseIdSequencer());
        return courseService.saveCourse(course);
    }
}
