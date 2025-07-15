package com.ecommerce.authservice.controller;

import com.ecommerce.authservice.dto.LoginRequest;
import com.ecommerce.authservice.dto.SignupRequest;
import com.ecommerce.authservice.domain.User;
import com.ecommerce.authservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*") // Allow frontend to call this API during development
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // 🔐 POST /api/auth/signup
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@Valid @RequestBody SignupRequest request) {
        userService.register(request.getUsername(), request.getPassword());
        return ResponseEntity.ok("User registered successfully 🎉");
    }

    // 🔐 POST /api/auth/login
    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody LoginRequest request) {
        // ⚠️ TEMPORARY: only verifies if username exists
        User user = userService.findByUsername(request.getUsername());
        if (user != null) {
            return ResponseEntity.ok("Login successful ✅ (No password check yet)");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials ❌");
        }
    }
}
