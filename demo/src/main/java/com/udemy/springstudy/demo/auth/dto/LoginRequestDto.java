package com.udemy.springstudy.demo.auth.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginRequestDto {
    private final String userId;
    private final String userPwd;
}
