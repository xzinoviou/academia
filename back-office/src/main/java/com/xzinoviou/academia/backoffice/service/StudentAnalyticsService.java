package com.xzinoviou.academia.backoffice.service;

import com.xzinoviou.academia.backoffice.domain.model.ResultGpa;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface StudentAnalyticsService {

    ResultGpa getResultGpaByStudentId(Long id);

}
