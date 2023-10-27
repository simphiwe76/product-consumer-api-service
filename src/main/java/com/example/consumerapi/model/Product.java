package com.example.consumerapi.model;

public record Product (
        Long id,
        String name,
        String description,
        String category,
        Double price
) {}
