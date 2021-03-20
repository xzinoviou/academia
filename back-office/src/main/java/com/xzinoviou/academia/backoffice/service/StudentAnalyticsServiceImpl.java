package com.xzinoviou.academia.backoffice.service;

import com.google.common.util.concurrent.AtomicDouble;
import com.xzinoviou.academia.backoffice.domain.model.Course;
import com.xzinoviou.academia.backoffice.domain.model.Result;
import com.xzinoviou.academia.backoffice.domain.model.ResultGpa;
import com.xzinoviou.academia.backoffice.domain.model.Student;
import com.xzinoviou.academia.backoffice.feign.CourseClient;
import com.xzinoviou.academia.backoffice.feign.ResultClient;
import com.xzinoviou.academia.backoffice.feign.StudentClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Service
public class StudentAnalyticsServiceImpl implements StudentAnalyticsService {

    private final StudentClient studentClient;
    private final CourseClient courseClient;
    private final ResultClient resultClient;

    public StudentAnalyticsServiceImpl(StudentClient studentClient, CourseClient courseClient, ResultClient resultClient) {
        this.studentClient = studentClient;
        this.courseClient = courseClient;
        this.resultClient = resultClient;
    }

    @Override
    public ResultGpa getResultGpaByStudentId(Long id) {
        Student student = studentClient.getStudentById(id);

        Map<Long, Result> results = resultClient.getResultsByStudentId(id).stream()
                .collect(Collectors.toMap(Result::getCourseId, Function.identity()));

        List<Course> courses = courseClient.getCoursesByIdIn(results.keySet());

        AtomicInteger totalMandatory = new AtomicInteger(0);
        AtomicDouble totalGrades = new AtomicDouble(0.0);

        courses.stream().forEach(course -> {

            if(course.isMandatory())
                totalMandatory.getAndIncrement();


            totalGrades.addAndGet(results.get(course.getId()).getGrade());

        });

        double gpa = Double.parseDouble(totalGrades.toString()) / (courses.size() * 1.0);

    return ResultGpa.builder()
                    .gpa(gpa)
                    .sin(student.getSin())
                    .firstName(student.getFirstName())
                    .lastName(student.getLastName())
                    .totalCourses(courses.size())
                    .totalElective(courses.size() - Integer.parseInt(totalMandatory.toString()))
                    .totalMandatory(Integer.parseInt(totalMandatory.toString()))
                    .build();
    }
}
