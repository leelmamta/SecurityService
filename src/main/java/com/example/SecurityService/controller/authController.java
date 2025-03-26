package com.example.SecurityService.controller;

import com.example.SecurityService.model.UserAuth;
import com.example.SecurityService.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class authController {
    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/login")
    public Mono<ResponseEntity<Map<String, String>>> login(@RequestBody UserAuth userAuth){
        System.out.println("userAuth---> = "+userAuth);
        if("admin".equals(userAuth.getUserName())&&"password".equals(userAuth.getPassword())){
            String token = jwtUtil.generateToken(userAuth.getUserName());
            return Mono.just(ResponseEntity.ok(Map.of("token", token)));
        }
        return Mono.just(ResponseEntity.status(401).build());
    }

}
