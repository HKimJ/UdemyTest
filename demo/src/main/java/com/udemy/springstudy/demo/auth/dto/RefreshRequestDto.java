package com.udemy.springstudy.demo.auth.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class RefreshRequestDto {
    private final String token;
    private final LocalDateTime expireTime;

}
