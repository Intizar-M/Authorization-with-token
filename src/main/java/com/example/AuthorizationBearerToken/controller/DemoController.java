package com.example.AuthorizationBearerToken.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endpoint");
    }

//    curl --location 'http://localhost:8080/api/v1/demo-controller' \
//            --header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJpbm5hQGdtYWlsLmNvbSIsImlhdCI6MTcyNzg0OTk3OCwiZXhwIjoxNzI3ODUxNDE4fQ.m62MScuhpa7Fb5Gz-8ipWHkgf1r7vAA7tarVg_-jTmA' \
//            --header 'Cookie: JSESSIONID=E1A69F707A63D89338745AC1CAF6EC9E'

}
