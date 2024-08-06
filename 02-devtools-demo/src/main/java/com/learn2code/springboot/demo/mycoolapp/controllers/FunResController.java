package com.learn2code.springboot.demo.mycoolapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunResController {
    @Value("${coach.name}")
    private String coachName;
    @GetMapping("/")
    public String sayHello() {
        return "HelloWorld to"+coachName;
    }

    //workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "run daily 5k steps!";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "today is lucky day";
    }
}
