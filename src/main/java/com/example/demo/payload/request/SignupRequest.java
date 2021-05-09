package com.example.demo.payload.request;

import com.example.demo.annotation.PasswordMatches;
import com.example.demo.annotation.ValidEmail;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@PasswordMatches
public class SignupRequest {
    @Email(message = "It should have email format")
    @NotBlank(message = "User email is required")
    @ValidEmail
    private String email;
    @NotBlank(message = "Please enter your name")
    private String firstname;
    @NotBlank(message = "Please enter your lastname")
    private String lastname;
    @NotBlank(message = "Please enter your username")
    private String username;
    @NotBlank(message = "Password is required")
    @Size(min=6)
    private String password;
    private String confirmPassword;
}
