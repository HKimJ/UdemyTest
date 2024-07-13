package com.udemy.springstudy.demo.auth.controller;

import com.udemy.springstudy.demo.auth.dto.LoginRequestDto;
import com.udemy.springstudy.demo.auth.dto.RefreshRequestDto;
import com.udemy.springstudy.demo.auth.dto.RefreshResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class MainController {
    @PostMapping("/login")
    public LoginRequestDto login(@RequestBody LoginRequestDto request) {
        return null;
    }

    @PostMapping("/refresh")
    public RefreshResponseDto refresh(@RequestBody RefreshRequestDto request) {
        return null;
    }


}
