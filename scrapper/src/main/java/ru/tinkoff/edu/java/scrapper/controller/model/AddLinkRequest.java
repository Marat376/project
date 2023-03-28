package ru.tinkoff.edu.java.scrapper.controller.model;

import jakarta.validation.constraints.NotBlank;

public record AddLinkRequest(
    @NotBlank String link
) {}
