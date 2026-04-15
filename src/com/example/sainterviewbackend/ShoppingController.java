package com.example.sainterviewbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ShoppingController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
                "message", "Spring backend is running",
                "status", "ok"
        );
    }

    @GetMapping("/users")
    public List<Map<String, Object>> users() {
        return List.of(
                Map.of("id", "1", "name", "John", "type", "customer"),
                Map.of("id", "2", "name", "Alice", "type", "developer")
        );
    }

    @GetMapping("/purchase")
    public List<Map<String, Object>> purchase() {
        return List.of(
                Map.of("type", "customer", "success", true),
                Map.of("type", "developer", "success", false)
        );
    }
}