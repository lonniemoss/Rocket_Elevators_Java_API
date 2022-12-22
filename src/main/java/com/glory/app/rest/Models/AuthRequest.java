package com.glory.app.rest.Models;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {

    @NotNull
    private String email;

    @NotNull
    private String password;

    public Object getUserId() {
        return null;
    }
}