package com.example.demo.controller;

import org.springframework.boot.SpringBootVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public Map<String, String> welcome() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Springboot rest api");
        return response;
    }

    @GetMapping("/info")
    public Map<String, String> getAppInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("projectName", "Springboot RestApi");
        info.put("javaVersion", System.getProperty("java.version"));
        info.put("springBootVersion", SpringBootVersion.getVersion());
        return info;
    }
}
