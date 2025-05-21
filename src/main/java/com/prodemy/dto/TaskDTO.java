package com.prodemy.dto;

import org.hibernate.validator.constraints.*;

import javax.validation.constraints.NotNull;

public class TaskDTO {
    @NotBlank
    private String title;

    @NotNull
    private Priority priority;
}