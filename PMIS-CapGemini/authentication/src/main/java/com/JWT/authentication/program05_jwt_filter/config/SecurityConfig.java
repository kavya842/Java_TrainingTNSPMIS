package com.JWT.authentication.program05_jwt_filter.config;

import com.JWT.authentication.program05_jwt_filter.filter.JwtAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration("program05SecurityConfig")
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http,
            JwtAuthenticationFilter jwtAuthenticationFilter) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/program01/**", "/program03/login", "/program04/**",
                                "/program06/public", "/program07/public").permitAll()
                        .requestMatchers("/program07/admin").hasRole("ADMIN")
                        .requestMatchers("/program07/student").hasRole("STUDENT")
                        .requestMatchers("/program07/user").hasAnyRole("ADMIN", "STUDENT")
                        .requestMatchers("/program06/user", "/program06/profile").authenticated()
                        .anyRequest().authenticated())
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}
