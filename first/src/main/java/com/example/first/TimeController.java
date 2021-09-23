package com.example.first;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("second")
public interface TimeController {

    @GetMapping("/time")
    String time();
}
