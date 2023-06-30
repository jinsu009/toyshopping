package com.example.demo.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RestController
@RequestMapping("/test/api")
@RequiredArgsConstructor
public class TestController {

    @GetMapping(value = "/home")
    public String getTest(){
        return "hello world";
    }
}
