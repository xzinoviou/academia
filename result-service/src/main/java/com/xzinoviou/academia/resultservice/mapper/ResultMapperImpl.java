package com.xzinoviou.academia.resultservice.mapper;

import com.xzinoviou.academia.resultservice.domain.jpa.Result;
import com.xzinoviou.academia.resultservice.domain.request.result.ResultCreateRequest;
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
}
