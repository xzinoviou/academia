package com.xzinoviou.academia.backoffice.feign;

import com.xzinoviou.academia.backoffice.domain.model.Result;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultCreateRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@FeignClient("resultservice")
public interface ResultClient {

    @GetMapping("/results")
    List<Result> getAllResults();

    @GetMapping("/results/id/{id}")
    Result getResultById(Long id);

    @GetMapping("/results/student/id/{id}")
    List<Result> getResultsByStudentId(Long studentId);

    @GetMapping("/results/course/id/{id}")
    List<Result> getResultsByCourseId(Long courseId);

    @PostMapping("/results")
    Result saveResult(ResultCreateRequest request);
}
