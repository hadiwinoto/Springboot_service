package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authManager;
    private final JwtUtil jwtUtil;
    private final UserRepository userRepo;
    private final PasswordEncoder passwordEncoder;

    public String login(String username, String rawPassword) {
        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, rawPassword));

        // Ambil UserDetails dari Authentication
        UserDetails userDetails = (UserDetails) auth.getPrincipal();

        // Generate token pakai UserDetails
        return jwtUtil.generateToken(userDetails);
    }

    public User register(String username, String rawPassword) {
        if (userRepo.existsByUsername(username)) {
            throw new IllegalArgumentException("Username already exists");
        }
        User user = User.builder()
                .username(username)
                .password(passwordEncoder.encode(rawPassword))
                .role("USER") // pastikan field 'role' ada di entity User
                .build();
        return userRepo.save(user);
    }
}
