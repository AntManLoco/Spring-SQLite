package com.SpringBootSQLite.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    //expose "/" that will return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
}