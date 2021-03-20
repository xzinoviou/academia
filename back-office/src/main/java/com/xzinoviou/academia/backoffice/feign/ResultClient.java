package com.xzinoviou.academia.backoffice.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@FeignClient("resultservice")
public interface ResultClient {
}
