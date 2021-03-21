package com.xzinoviou.academia.backoffice.feign;

import com.xzinoviou.academia.backoffice.domain.dto.ResultDto;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultCreateRequest;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultUpdateRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@FeignClient(name = "resultservice", path = "/results")
public interface ResultClient {

    @GetMapping
    List<ResultDto> getAllResults();

    @GetMapping("/id/{id}")
    ResultDto getResultById(@PathVariable("id") Long id);

    @GetMapping("/student/id/{id}")
    List<ResultDto> getResultsByStudentId(@PathVariable("id") Long studentId);

    @GetMapping("/course/id/{id}")
    List<ResultDto> getResultsByCourseId(@PathVariable("id") Long courseId);

    @PostMapping
    ResultDto saveResult(@RequestBody ResultCreateRequest request);

    @PutMapping
    ResultDto updateResult(@RequestBody ResultUpdateRequest request);

    @DeleteMapping("/id/{id}")
    String deleteResultById(@PathVariable("id") Long id);
}
