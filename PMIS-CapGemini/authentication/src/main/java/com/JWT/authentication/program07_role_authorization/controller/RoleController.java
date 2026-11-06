package com.JWT.authentication.program07_role_authorization.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/program07")
public class RoleController {

    @GetMapping("/public")
    public ResponseEntity<String> publicEndpoint() {
        return ResponseEntity.ok("Everyone can access this endpoint");
    }

    @GetMapping("/user")
    public ResponseEntity<String> userEndpoint() {
        return ResponseEntity.ok("ADMIN and STUDENT can access this endpoint");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> adminEndpoint() {
        return ResponseEntity.ok("Only ADMIN can access this endpoint");
    }

    @GetMapping("/student")
    public ResponseEntity<String> studentEndpoint() {
        return ResponseEntity.ok("Only STUDENT can access this endpoint");
    }
}
