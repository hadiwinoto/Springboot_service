package com.example.demo.controller.auth;

import org.springframework.web.bind.annotation.*;
import com.example.demo.model.User;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        User savedUser = userService.registerUser(user);

        Map<String, String> response = Map.of(
            "message", "User registered successfully",
            "userId", savedUser.getPkUserId().toString()
        );
        return ResponseEntity.ok(response);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
            .map(user -> {
                user.setPassword(null);
                return ResponseEntity.ok(user);
            })
            .orElse(ResponseEntity.notFound().build());
        }

}
