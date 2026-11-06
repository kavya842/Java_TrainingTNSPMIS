package com.JWT.authentication.program03_jwt_generation.controller;

import com.JWT.authentication.program03_jwt_generation.model.AuthResponse;
import com.JWT.authentication.program03_jwt_generation.model.LoginRequest;
import com.JWT.authentication.program03_jwt_generation.service.JwtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/program03")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthController(AuthenticationManager authenticationManager, JwtService jwtService) {
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.username(), request.password()));
            String token = jwtService.generateToken((org.springframework.security.core.userdetails.UserDetails)
                    authentication.getPrincipal());
            return ResponseEntity.ok(new AuthResponse(token));
        } catch (org.springframework.security.core.AuthenticationException exception) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
