package com.udemy.springstudy.demo.auth.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponseDto {
    private final boolean isSucess;
}
