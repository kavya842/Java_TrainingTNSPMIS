package com.JWT.authentication.program04_jwt_validation.controller;

import com.JWT.authentication.program04_jwt_validation.service.JwtValidationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/program04")
public class JwtValidationController {

    private final JwtValidationService validationService;

    public JwtValidationController(JwtValidationService validationService) {
        this.validationService = validationService;
    }

    @PostMapping("/validate")
    public ResponseEntity<String> validate(@RequestParam String token) {
        String result = validationService.validate(token);
        return ResponseEntity.ok(result);
    }
}
