package com.sb.blog.service;

import com.sb.payload.LoginDto;
import com.sb.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
