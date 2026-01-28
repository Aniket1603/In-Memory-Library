package com.library.api.dto;

public record BookResponseDTO(
        Integer id,
        String title,
        String author,
        Integer year
) {}
