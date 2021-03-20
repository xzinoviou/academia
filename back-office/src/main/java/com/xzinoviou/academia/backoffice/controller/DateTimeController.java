package com.xzinoviou.academia.backoffice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

/**
 * Author : xzinoviou.
 * Project : student-service.
 * Created on 20/3/21.
 */
@RestController
@RequestMapping("/back-office/date-time/")
public class DateTimeController {

    @GetMapping("/offset-date-time")
    public ResponseEntity<OffsetDateTime> offsetDateTimeNow() {
        return ResponseEntity.ok(OffsetDateTime.from(Instant.now()));
    }

    @GetMapping("/instant")
    public ResponseEntity<Instant> instantNow() {
        return ResponseEntity.ok(Instant.now());
    }

    @GetMapping("/local-date-time")
    public ResponseEntity<LocalDateTime> localDateTimeNow() {
        return ResponseEntity.ok(LocalDateTime.now());
    }

    @GetMapping("/local-date")
    public ResponseEntity<LocalDate> localDateNow() {
        return ResponseEntity.ok(LocalDate.now());
    }
}
