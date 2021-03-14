package com.xzinoviou.academia.studentservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 15/3/21.
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public List<Map<String, Integer>> getStudents() {
        return createMap();
    }

    private List<Map<String, Integer>> createMap() {
        return IntStream.of(0, 5).mapToObj(i -> {
            Map<String, Integer> map = new HashMap<>();
            map.put(String.valueOf(i), i);
            return map;
        }).collect(Collectors.toList());
    }
}
