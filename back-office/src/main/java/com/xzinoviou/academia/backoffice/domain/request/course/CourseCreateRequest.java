package com.xzinoviou.academia.backoffice.domain.request.course;

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
