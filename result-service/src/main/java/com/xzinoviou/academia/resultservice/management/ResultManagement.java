package com.xzinoviou.academia.resultservice.management;

import com.xzinoviou.academia.resultservice.domain.dto.ResultDto;
import com.xzinoviou.academia.resultservice.domain.request.ResultCreateRequest;
import com.xzinoviou.academia.resultservice.domain.request.ResultUpdateRequest;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface ResultManagement {

    ResultDto getResultById(Long id);

    List<ResultDto> getResultsByStudentId(Long studentId);

    List<ResultDto> getResultsByCourseId(Long courseId);

    List<ResultDto> getAllResults();

    ResultDto saveResult(ResultCreateRequest request);

    ResultDto updateResult(ResultUpdateRequest request);

    String deleteResult(Long id);
}
