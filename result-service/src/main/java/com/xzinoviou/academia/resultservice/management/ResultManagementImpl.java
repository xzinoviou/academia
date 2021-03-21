package com.xzinoviou.academia.resultservice.management;

import com.xzinoviou.academia.resultservice.domain.dto.ResultDto;
import com.xzinoviou.academia.resultservice.domain.request.ResultCreateRequest;
import com.xzinoviou.academia.resultservice.domain.request.ResultUpdateRequest;
import com.xzinoviou.academia.resultservice.mapper.ResultMapper;
import com.xzinoviou.academia.resultservice.service.ResultService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public ResultDto getResultById(Long id) {
        return resultMapper.mapToDto(resultService.getResultById(id));
    }

    @Override
    public List<ResultDto> getResultsByStudentId(Long studentId) {
        return resultService.getResultsByStudentId(studentId).stream()
                .map(resultMapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public List<ResultDto> getResultsByCourseId(Long courseId) {
        return resultService.getResultsByCourseId(courseId).stream()
                .map(resultMapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public List<ResultDto> getAllResults() {
        return resultService.getAllResults().stream()
                .map(resultMapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public ResultDto saveResult(ResultCreateRequest request) {
        return resultMapper.mapToDto(resultService.saveResult(
                resultMapper.convertToEntity(request)));
    }

    @Override
    public ResultDto updateResult(ResultUpdateRequest request) {
        return resultMapper.mapToDto(resultService.updateResult(
                resultMapper.convertToEntity(request))
        );
    }

    @Override
    public String deleteResult(Long id) {
        return resultService.deleteResult(id);
    }
}
