package ru.tinkoff.edu.java.scrapper.controller.model;

import java.util.List;

public record ListLinksResponse(
    List<LinkResponse> links,
    Integer size
) {}
