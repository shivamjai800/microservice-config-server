package com.microservice.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod()
    {
        return "User service is taking longer than usual"+" Please try again later ";
    }
    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod()
    {
        return "Department service is taking longer than usual"+" Please try again later ";
    }
}
