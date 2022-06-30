package com.example.lab6securityassignment.service.impl;

import com.example.lab6securityassignment.model.LoginRequest;
import com.example.lab6securityassignment.model.LoginResponse;
import com.example.lab6securityassignment.model.RefreshTokenRequest;
import com.example.lab6securityassignment.service.UaaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UaaServiceImpl implements UaaService {
    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest) {
        return null;
    }
}
