package com.JWT.authentication.program04_jwt_validation.service;

import com.JWT.authentication.program03_jwt_generation.service.JwtService;
import io.jsonwebtoken.JwtException;
import org.springframework.stereotype.Service;

@Service
public class JwtValidationService {

    private final JwtService jwtService;

    public JwtValidationService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public String validate(String token) {
        try {
            String username = jwtService.extractUsername(token);
            return "Valid token for user: " + username;
        } catch (JwtException | IllegalArgumentException exception) {
            return "Invalid token: " + exception.getMessage();
        }
    }
}
