package com.xzinoviou.academia.courseservice.management;

import com.xzinoviou.academia.courseservice.domain.jpa.Course;
import com.xzinoviou.academia.courseservice.domain.request.CourseCreateRequest;

import java.util.List;
import java.util.Set;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface CourseManagement {

    Course getCourseById(Long id);

    Course getCourseByCin(String cin);

    List<Course> getAllCourses();

    Course saveCourse(CourseCreateRequest request);

    List<Course> getCoursesByIdIn(Set<Long> ids);

}
