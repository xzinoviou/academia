package com.xzinoviou.academia.courseservice.manager;

import com.xzinoviou.academia.courseservice.domain.jpa.Course;
import com.xzinoviou.academia.courseservice.domain.request.CourseCreateRequest;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface CourseManager {

    Course saveCourse(CourseCreateRequest request);

}
