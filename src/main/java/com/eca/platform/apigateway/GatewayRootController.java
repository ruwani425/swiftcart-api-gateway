package com.eca.platform.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GatewayRootController {

    @GetMapping("/")
    public Map<String, Object> getGatewayStatus() {
        return Map.of(
                "service", "Enterprise Cloud Architecture - Spring Cloud API Gateway",
                "status", "UP",
                "frontendUrl", "http://localhost:3000",
                "eurekaDashboard", "http://localhost:8761",
                "endpoints", Map.of(
                        "users", "http://localhost:8080/api/v1/users",
                        "products", "http://localhost:8080/api/v1/products",
                        "orders", "http://localhost:8080/api/v1/orders"
                )
        );
    }
}
