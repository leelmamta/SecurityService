package org.auth.dto;



public class AuthResponse {
    private String token;

    public AuthResponse() {} // Required for deserialization

    public AuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}