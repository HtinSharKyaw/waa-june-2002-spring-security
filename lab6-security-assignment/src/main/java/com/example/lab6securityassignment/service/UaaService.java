package com.example.lab6securityassignment.service;

import com.example.lab6securityassignment.model.LoginRequest;
import com.example.lab6securityassignment.model.LoginResponse;
import com.example.lab6securityassignment.model.RefreshTokenRequest;

public interface UaaService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
