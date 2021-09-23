package com.example.second;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class TimeController {

    @GetMapping("/time")
    public String time() {
        return Instant.now().toString();
    }
}
