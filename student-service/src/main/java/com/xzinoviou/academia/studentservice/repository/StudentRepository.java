package com.xzinoviou.academia.studentservice.repository;

import com.xzinoviou.academia.studentservice.domain.jpa.Student;
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
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT max(s.id) FROM Student s")
    Optional<Long> findLastStudentInserted();

    Optional<Student> findBySin(String sin);
}
