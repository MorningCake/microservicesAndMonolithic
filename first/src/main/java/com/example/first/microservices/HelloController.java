package com.example.first.microservices;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Profile("microservices")
@RestController
public class HelloController {

    private final TimeController timeController;

    public HelloController(TimeController timeController) {
        this.timeController = timeController;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return String.format("Hello %s, current time: %s", name, timeController.time());
    }
}
