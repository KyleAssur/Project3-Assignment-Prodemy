package com.prodemy.dto;

import org.hibernate.validator.constraints.*;

import javax.validation.constraints.Size;

public class UserDTO {
    @NotBlank
    private String full_name;

    @Email
    @NotBlank
    private String email;

    @Size(min = 8)
    private String password;
}