package com.example.myfirstspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JournalEntryController {
    @GetMapping("/")
    public String sayHell(){

        return "Hello World";
    }


}
