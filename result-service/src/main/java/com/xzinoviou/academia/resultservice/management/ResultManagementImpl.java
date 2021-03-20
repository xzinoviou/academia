package com.xzinoviou.academia.resultservice.management;

import com.xzinoviou.academia.resultservice.domain.jpa.Result;
import com.xzinoviou.academia.resultservice.domain.request.result.ResultCreateRequest;
import com.xzinoviou.academia.resultservice.mapper.ResultMapper;
import com.xzinoviou.academia.resultservice.service.ResultService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Service
public class ResultManagementImpl implements ResultManagement {

    private final ResultService resultService;
    private final ResultMapper resultMapper;

    public ResultManagementImpl(ResultService resultService, ResultMapper resultMapper) {
        this.resultService = resultService;
        this.resultMapper = resultMapper;
    }

    @Override
    public Result getResultById(Long id) {
        return resultService.getResultById(id);
    }

    @Override
    public List<Result> getResultsByStudentId(Long studentId) {
        return resultService.getResultsByStudentId(studentId);
    }

    @Override
    public List<Result> getResultsByCourseId(Long courseId) {
        return resultService.getResultsByCourseId(courseId);
    }

    @Override
    public List<Result> getAllResults() {
        return resultService.getAllResults();
    }

    @Override
    public Result saveResult(ResultCreateRequest request) {
        return resultService.saveResult(
                resultMapper.convertToEntity(request));
    }
}
