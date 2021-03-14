package com.xzinoviou.academia.resultservice.controller;

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
@RequestMapping("/results")
public class ResultController {

    @GetMapping
    public List<Map<String, Integer>> getResults() {
        return createMap();
    }

    private List<Map<String, Integer>> createMap() {
        return IntStream.range(0, 5).mapToObj(i -> {
            Map<String, Integer> map = new HashMap<>();
            map.put("Result " + String.valueOf(i), i);
            return map;
        }).collect(Collectors.toList());
    }
}
