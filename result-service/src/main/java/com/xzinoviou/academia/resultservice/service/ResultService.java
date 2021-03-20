package com.xzinoviou.academia.resultservice.service;

import com.xzinoviou.academia.resultservice.domain.jpa.Result;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface ResultService {

    Result getResultById(Long id);

    List<Result> getResultsByStudentId(Long studentId);

    List<Result> getResultsByCourseId(Long courseId);

    List<Result> getAllResults();

    Result saveResult(Result result);

}
