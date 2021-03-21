package com.xzinoviou.academia.backoffice.service.result;

import com.xzinoviou.academia.backoffice.domain.dto.ResultDto;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultCreateRequest;
import com.xzinoviou.academia.backoffice.domain.request.result.ResultUpdateRequest;
import com.xzinoviou.academia.backoffice.feign.ResultClient;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 21/3/21.
 */

@Service
public class ResultServiceImpl implements ResultService {

    private final ResultClient resultClient;

    public ResultServiceImpl(ResultClient resultClient) {
        this.resultClient = resultClient;
    }

    @Override
    public List<ResultDto> getAllResults() {
        return resultClient.getAllResults();
    }

    @Override
    public ResultDto getResultById(Long id) {
        return resultClient.getResultById(id);
    }

    @Override
    @Cacheable(value = "studentResults", key = "#studentId")
    public List<ResultDto> getResultsByStudentId(Long studentId) {
        return resultClient.getResultsByStudentId(studentId);
    }

    @Override
    public List<ResultDto> getResultsByCourseId(Long courseId) {
        return resultClient.getResultsByCourseId(courseId);
    }

    @Override
    @CacheEvict(value = {"studentResults", "resultGpa"})
    public ResultDto saveResult(ResultCreateRequest request) {
        return resultClient.saveResult(request);
    }

    @Override
    @CacheEvict(value = {"studentResults", "resultGpa"})
    public ResultDto updateResult(ResultUpdateRequest request) {
        return resultClient.updateResult(request);
    }

    @Override
    @CacheEvict(value = {"studentResults", "resultGpa"})
    public String deleteResultById(Long id) {
        return resultClient.deleteResultById(id);
    }
}
