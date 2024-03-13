package com.apitrove.springboot_scheduler_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apitrove.springboot_scheduler_demo.dto.UserName;

@RestController
public class SampleController {

    @GetMapping("/name")
    public String getName() {
        UserName name = new UserName("some name");
        return name.name();
    }
}
