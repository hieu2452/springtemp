package com.hieu.springboot.demo.myspringapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String Hello(){
        return "Hello world!";
    }
}
