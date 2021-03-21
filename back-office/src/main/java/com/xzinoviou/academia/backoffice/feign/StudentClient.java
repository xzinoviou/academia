package com.xzinoviou.academia.backoffice.feign;

import com.xzinoviou.academia.backoffice.domain.dto.StudentDto;
import com.xzinoviou.academia.backoffice.domain.request.student.StudentCreateRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@FeignClient(name = "studentservice", path = "/students")
public interface StudentClient {

    @GetMapping
    List<StudentDto> getAllStudents();

    @GetMapping("/id/{id}")
    StudentDto getStudentById(@PathVariable("id") Long id);

    @GetMapping("/sin/{sin}")
    StudentDto getStudentBySin(@PathVariable("sin") String sin);

    @PostMapping
    StudentDto saveStudent(@RequestBody StudentCreateRequest request);
}

