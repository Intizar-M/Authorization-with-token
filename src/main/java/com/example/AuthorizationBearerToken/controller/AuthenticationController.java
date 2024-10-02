package com.example.AuthorizationBearerToken.controller;

import com.example.AuthorizationBearerToken.auth.AuthenticationRequest;
import com.example.AuthorizationBearerToken.auth.AuthenticationResponse;
import com.example.AuthorizationBearerToken.auth.RegisterRequest;
import com.example.AuthorizationBearerToken.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request));
    }

//    curl --location 'http://localhost:8080/api/v1/auth/register' \
//            --header 'Content-Type: application/json' \
//            --header 'Cookie: JSESSIONID=E1A69F707A63D89338745AC1CAF6EC9E' \
//            --data-raw '{
//            "firstname": "Intizar",
//            "lastname": "M",
//            "email": "inna@gmail.com",
//            "password": "asdf"
//            }'

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate (
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }

//    curl --location 'http://localhost:8080/api/v1/auth/authenticate' \
//            --header 'Content-Type: application/json' \
//            --header 'Cookie: JSESSIONID=E1A69F707A63D89338745AC1CAF6EC9E' \
//            --data-raw '{
//            "email": "inna@gmail.com",
//            "password": "asdf"
//            }'

}
