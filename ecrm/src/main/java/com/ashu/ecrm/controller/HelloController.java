package com.ashu.ecrm.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String employeeDetails() {
        return "Greetings from Spring Boot!";
    }

}