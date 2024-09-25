package com.cg.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "Customer Service is taking longer than Expected " + " Please try again";
        }

    @GetMapping("/adminServiceFallBack")
    public String adminServiceFallBackMethod(){
        return "Admin Service is taking longer than Expected " + " Please try again";
    }

    @GetMapping("/loanServiceFallBack")
    public String loanServiceFallBackMethod(){
        return "Loan Service is taking longer than Expected " + " Please try again";
    }
}
