package com.blog.microscommunication.restclient.dto;

public record ProductResponse(
        Long id,
        String name,
        double price
) {
}
