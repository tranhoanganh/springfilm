package com.demo.film.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginRequest {
    @NotBlank(message = "username not blank")
    private String username;
    @NotBlank(message = "password not blank")
    private String password;
}
