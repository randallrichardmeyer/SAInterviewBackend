package com.example.sainterviewbackend;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller
public class ShoppingController {

    @QueryMapping
    public Map<String, String> home() {
        return Map.of(
                "message", "Spring backend is running",
                "status", "ok"
        );
    }

    @QueryMapping
    public List<Map<String, Object>> users() {
        return List.of(
                Map.of("id", 1, "name", "John", "type", "customer"),
                Map.of("id", 2, "name", "Alice", "type", "developer")
        );
    }

    @QueryMapping
    public List<Map<String, Object>> purchase() {
        return List.of(
                Map.of("type", "customer", "success", true),
                Map.of("type", "developer", "success", false)
        );
    }
}