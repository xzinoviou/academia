package com.xzinoviou.academia.resultservice.feign;

import com.xzinoviou.academia.resultservice.domain.model.Student;
import com.xzinoviou.academia.resultservice.domain.request.student.StudentCreateRequest;
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
@FeignClient("/studentservice")
public interface StudentClient {

    @GetMapping("/students/id/{id}")
    List<Student> getStudentById(@PathVariable("id") Long id);

    @GetMapping("/students/sin/{sin}")
    List<Student> getStudentBySin(@PathVariable("sin") String sin);

    @PostMapping("/students")
    Student saveStudent(@RequestBody StudentCreateRequest request);
}
