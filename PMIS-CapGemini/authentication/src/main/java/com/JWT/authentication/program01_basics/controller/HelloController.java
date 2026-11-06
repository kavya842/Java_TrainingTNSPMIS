package com.JWT.authentication.program01_basics.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/program01")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloMessage() {

        return ResponseEntity.ok("Hello from Program 01");
    }
}
