package com.example.springauthenticationauthorizationdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public String getStudentMessage(){
        System.out.println("Inside StudentController getStudentMessage() method.");
        return "message by student";
    }
}
