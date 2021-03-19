package com.xzinoviou.academia.studentservice.manager;

import com.xzinoviou.academia.studentservice.domain.jpa.Student;
import com.xzinoviou.academia.studentservice.domain.request.StudentCreateRequest;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
public interface StudentManager {

    Student saveStudent(StudentCreateRequest request);
}
