package com.blog.microscommunication.feign.dto;

public record OrderRequest(
        Long productId,
        int quantity
) {
}