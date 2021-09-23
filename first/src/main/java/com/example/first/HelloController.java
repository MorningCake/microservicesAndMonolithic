package com.example.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
