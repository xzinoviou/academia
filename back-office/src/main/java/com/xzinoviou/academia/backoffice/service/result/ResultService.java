package com.xzinoviou.academia.backoffice.service.result;

import com.xzinoviou.academia.backoffice.domain.dto.ResultDto;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultCreateRequest;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultUpdateRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */
public interface ResultService {

    List<ResultDto> getAllResults();

    ResultDto getResultById(Long id);

    List<ResultDto> getResultsByStudentId(Long studentId);

    List<ResultDto> getResultsByCourseId(Long courseId);

    ResultDto saveResult(ResultCreateRequest request);

    ResultDto updateResult(ResultUpdateRequest request);

    String deleteResultById(Long id);
}
