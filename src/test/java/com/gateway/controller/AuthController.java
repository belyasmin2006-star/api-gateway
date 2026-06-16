package com.gateway.controller;

import com.gateway.security.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/login")
    public String login() {

        JwtUtil jwtUtil = new JwtUtil();

        return jwtUtil.generateToken("yasmine");
    }
}