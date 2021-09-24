package com.example.first.microservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;

@Profile("microservices")
@FeignClient("second")
public interface TimeController {

    @GetMapping("/time")
    String time();
}
