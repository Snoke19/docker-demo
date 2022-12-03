package com.demo.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/")
    public String getHelloWorld() {

        return "Hello, world!11111111";
    }
}