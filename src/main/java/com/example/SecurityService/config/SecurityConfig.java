package com.example.SecurityService.config;

import com.example.SecurityService.security.JwtAuthenticationFilter;
import com.example.SecurityService.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.SecurityWebFiltersOrder;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.config.web.server.ServerHttpSecurity;
@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {
    @Autowired
    JwtUtil jwtUtil;

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http){
      return http
              .csrf(ServerHttpSecurity.CsrfSpec::disable)
              .authorizeExchange(exchanges-> exchanges
                      .pathMatchers("/auth/login").permitAll()
                      .anyExchange().authenticated())
              .addFilterAt(new JwtAuthenticationFilter(jwtUtil), SecurityWebFiltersOrder.AUTHENTICATION).build();

    }
}
