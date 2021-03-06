package com.xzinoviou.academia.courseservice.domain.request;

import lombok.Getter;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@Getter
public class CourseCreateRequest {

    private String title;

    private boolean mandatory;

}
