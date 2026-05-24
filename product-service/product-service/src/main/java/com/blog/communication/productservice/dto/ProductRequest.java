package com.blog.communication.productservice.dto;

public record ProductRequest(
        Long id,
        String name,
        double price
) {
}
