package com.learn2code.springboot.demo.mycoolapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunResController {
    @GetMapping("/")
    public String sayHello() {
        return "HelloWorld";
    }
}
