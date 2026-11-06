package com.JWT.authentication.program01_basics.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/program01")
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<String> getUserMessage() {
        return ResponseEntity.ok(
                "This is the user endpoint from Program 01");
    }
}
