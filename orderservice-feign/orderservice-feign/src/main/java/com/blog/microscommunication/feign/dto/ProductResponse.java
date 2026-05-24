package com.blog.microscommunication.feign.dto;

public record ProductResponse(
        Long id,
        String name,
        double price
) {
}
