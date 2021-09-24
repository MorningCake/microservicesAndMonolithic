package com.example.first.monolithic;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@Profile("monolithic")
@RestController
public class HelloController {

    public HelloController() { }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return String.format("Hello %s, current time: %s", name, Instant.now().toString());
    }
}
