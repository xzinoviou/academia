package com.xzinoviou.academia.backoffice.feign;

import com.xzinoviou.academia.backoffice.domain.model.Result;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultCreateRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@FeignClient(name = "resultservice",path = "/results")
public interface ResultClient {

    @GetMapping
    List<Result> getAllResults();

    @GetMapping("/id/{id}")
    Result getResultById(@PathVariable("id") Long id);

    @GetMapping("/student/id/{id}")
    List<Result> getResultsByStudentId(@PathVariable("id") Long studentId);

    @GetMapping("/course/id/{id}")
    List<Result> getResultsByCourseId(@PathVariable("id") Long courseId);

    @PostMapping
    Result saveResult(@RequestBody ResultCreateRequest request);
}
