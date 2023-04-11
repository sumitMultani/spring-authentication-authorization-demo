package com.example.springauthenticationauthorizationdemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RestMapping("/message")
public class MessageController {

    @GetMapping("/")
    public String getMessage(){
        System.out.println("Inside MessagController getMessage() method.");
        return "message";
    }
}
