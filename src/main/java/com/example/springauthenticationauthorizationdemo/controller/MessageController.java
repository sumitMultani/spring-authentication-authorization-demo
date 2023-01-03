package com.example.springauthenticationauthorizationdemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MessageController {

    @GetMapping("/message")
    public String getMessage(){
        System.out.println("Inside MessagController getMessage() method.");
        return "message";
    }
}