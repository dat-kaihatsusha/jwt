package com.oauth.jwt.auth.payload;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginRequest {

    @NotEmpty(message = "Thiếu username")
    private String username;

    @NotEmpty(message = "Thiếu password")
    private String password;

}
