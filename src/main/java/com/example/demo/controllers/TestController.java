package com.example.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
@CrossOrigin
public class TestController {

    @GetMapping(value = "test")
    public String maangeResponse(){
        return "test.............";
    }

}
