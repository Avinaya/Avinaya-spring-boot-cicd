package com.avinaya.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {

    @GetMapping()
    public String test(){
        return "Hello from cicd";
    }
    @GetMapping("/test")
    public String testCi(){
        return "Hello from Test api";
    }
}
