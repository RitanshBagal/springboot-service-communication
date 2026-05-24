package com.blog.microscommunication.restclient.dto;

public record OrderRequest(
        Long productId,
        int quantity
) {
}