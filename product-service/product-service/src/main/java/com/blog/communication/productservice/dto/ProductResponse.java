package com.blog.communication.productservice.dto;

public record ProductResponse(
        Long id,
        String name,
        double price
) {
}
