package com.example.SecurityService.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class JwtUtil {
    private final String SECRET_KEY = "secret";
    public String generateToken(String userName){
    return Jwts
            .builder()
            .setSubject(userName)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis()+1000*60*60))
            .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
            .compact();

    }
    public boolean validateToken(String token, String userName){
        return userName.equals(extractUsername(token))&&!isTokenExpired(token);
    }
    public String extractUsername(String token){
        return extractClaims(token).getSubject();
    }
    public boolean isTokenExpired(String token){
        return extractClaims(token).getExpiration().before(new Date());
    }
    private Claims extractClaims(String token){
        return Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody();
    }
}
