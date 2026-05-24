package com.blog.microscommunication.resttemplate.dto;

public record OrderRequest(
        Long productId,
        int quantity
) {
}