package com.xzinoviou.academia.resultservice.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@FeignClient("courseservice")
public interface CourseClient {
}
