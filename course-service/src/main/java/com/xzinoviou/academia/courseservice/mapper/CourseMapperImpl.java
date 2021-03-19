package com.xzinoviou.academia.courseservice.mapper;

import com.xzinoviou.academia.courseservice.domain.jpa.Course;
import com.xzinoviou.academia.courseservice.domain.request.CourseCreateRequest;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Component
public class CourseMapperImpl implements CourseMapper{

    @Override
    public Course convertToEntity(CourseCreateRequest request) {
        return Course.builder()
                .creationDate(OffsetDateTime.now())
                .title(request.getTitle())
                .mandatory(request.isMandatory())
                .build();
    }
}
