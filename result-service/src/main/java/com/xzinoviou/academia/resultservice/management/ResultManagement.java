package com.xzinoviou.academia.resultservice.management;

import com.xzinoviou.academia.resultservice.domain.jpa.Result;
import com.xzinoviou.academia.resultservice.domain.request.result.ResultCreateRequest;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface ResultManagement {

    Result getResultById(Long id);

    List<Result> getResultsByStudentId(Long studentId);

    List<Result> getResultsByCourseId(Long courseId);

    List<Result> getAllResults();

    Result saveResult(ResultCreateRequest request);
}
