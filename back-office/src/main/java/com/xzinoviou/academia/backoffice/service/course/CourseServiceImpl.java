package com.xzinoviou.academia.backoffice.service.course;

import com.xzinoviou.academia.backoffice.domain.dto.CourseDto;
import com.xzinoviou.academia.backoffice.domain.request.course.CourseCreateRequest;
import com.xzinoviou.academia.backoffice.feign.CourseClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
@Service
public class CourseServiceImpl implements CourseService {

    private final CourseClient courseClient;

    public CourseServiceImpl(CourseClient courseClient) {
        this.courseClient = courseClient;
    }

    @Override
    public List<CourseDto> getAllCourses() {
        return courseClient.getAllCourses();
    }

    @Override
    public CourseDto getCourseById(Long id) {
        return courseClient.getCourseById(id);
    }

    @Override
    public CourseDto getCourseByCin(String cin) {
        return courseClient.getCourseByCin(cin);
    }

    @Override
    public CourseDto saveCourse(CourseCreateRequest request) {
        return courseClient.saveCourse(request);
    }

    @Override
    public List<CourseDto> getCoursesByIdIn(Set<Long> ids) {
        return courseClient.getCoursesByIdIn(ids);
    }
}
