package com.xzinoviou.academia.resultservice.mapper;

import com.xzinoviou.academia.resultservice.domain.dto.ResultDto;
import com.xzinoviou.academia.resultservice.domain.jpa.Result;
import com.xzinoviou.academia.resultservice.domain.request.ResultCreateRequest;
import com.xzinoviou.academia.resultservice.domain.request.ResultUpdateRequest;
import org.springframework.stereotype.Component;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Component
public class ResultMapperImpl implements ResultMapper {


    @Override
    public Result convertToEntity(ResultCreateRequest request) {
        return Result.builder()
                .studentId(request.getStudentId())
                .courseId(request.getCourseId())
                .examDate(request.getExamDate())
                .grade(request.getGrade())
                .semester(request.getSemester())
                .build();
    }

    @Override
    public Result convertToEntity(ResultUpdateRequest request) {
        return Result.builder()
                .id(request.getId())
                .studentId(request.getStudentId())
                .courseId(request.getCourseId())
                .examDate(request.getExamDate())
                .grade(request.getGrade())
                .semester(request.getSemester())
                .build();
    }

    @Override
    public ResultDto mapToDto(Result result) {
        return ResultDto.builder()
                .id(result.getId())
                .studentId(result.getStudentId())
                .courseId(result.getCourseId())
                .examDate(result.getExamDate())
                .grade(result.getGrade())
                .semester(result.getSemester())
                .build();
    }
}
