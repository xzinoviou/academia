package com.xzinoviou.academia.resultservice.mapper;

import com.xzinoviou.academia.resultservice.domain.dto.ResultDto;
import com.xzinoviou.academia.resultservice.domain.jpa.Result;
import com.xzinoviou.academia.resultservice.domain.request.ResultCreateRequest;
import com.xzinoviou.academia.resultservice.domain.request.ResultUpdateRequest;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface ResultMapper {

    Result convertToEntity(ResultCreateRequest request);

    Result convertToEntity(ResultUpdateRequest request);

    ResultDto mapToDto(Result result);
}
