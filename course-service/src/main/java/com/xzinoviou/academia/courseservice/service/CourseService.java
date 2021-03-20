package com.xzinoviou.academia.courseservice.service;

import com.xzinoviou.academia.courseservice.domain.jpa.Course;

import java.util.List;
import java.util.Set;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface CourseService {

    Course getCourseById(Long id);

    Course getCourseByCin(String cin);

    List<Course> getAllCourses();

    Course saveCourse(Course course);

    Long getNextCourseIdSequencer();

    List<Course> getCoursesByIdIn(Set<Long> ids);
}
