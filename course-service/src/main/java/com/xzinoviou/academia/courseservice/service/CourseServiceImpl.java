package com.xzinoviou.academia.courseservice.service;

import com.xzinoviou.academia.courseservice.domain.jpa.Course;
import com.xzinoviou.academia.courseservice.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course with id : " + id + " was not found"));
    }

    @Override
    public Course getCourseByCin(String cin) {
        return courseRepository.findByCin(cin)
                .orElseThrow(() -> new RuntimeException("Course with cin : " + cin + " was not found"));
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Long getNextCourseIdSequencer() {
        return courseRepository.findLastCourseInserted().orElseGet(() -> 0L) + 1L;
    }

    @Override
    public List<Course> getCoursesByIdIn(Set<Long> ids) {
        return courseRepository.findByIdIn(ids);
    }
}
