package com.library.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BookRequestDTO(
        @NotNull Integer id,
        @NotBlank String title,
        @NotBlank String author,
        @NotNull Integer year
) {}
