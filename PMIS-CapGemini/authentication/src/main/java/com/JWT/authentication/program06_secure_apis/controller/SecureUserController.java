package com.JWT.authentication.program06_secure_apis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/program06")
public class SecureUserController {

    @GetMapping("/public")
    public ResponseEntity<String> publicEndpoint() {
        return ResponseEntity.ok("This endpoint is public");
    }

    @GetMapping("/user")
    public ResponseEntity<String> userEndpoint() {
        return ResponseEntity.ok("This endpoint requires a valid JWT");
    }

    @GetMapping("/profile")
    public ResponseEntity<Map<String, String>> profile(Authentication authentication) {
        String role = authentication.getAuthorities().iterator().next().getAuthority();
        return ResponseEntity.ok(Map.of("username", authentication.getName(), "role", role));
    }
}
