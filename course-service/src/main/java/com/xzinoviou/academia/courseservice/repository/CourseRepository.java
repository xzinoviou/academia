package com.xzinoviou.academia.courseservice.repository;

import com.xzinoviou.academia.courseservice.domain.jpa.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

    @Query("SELECT max(c.id) FROM Course c")
    Optional<Long> findLastCourseInserted();

    Optional<Course> findByCin(String cin);
}
