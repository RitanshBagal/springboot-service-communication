package com.blog.microscommunication.resttemplate.dto;

public record OrderResponse(
        Long orderId,
        Long productId,
        String productName,
        int quantity,
        double pricePerUnit,
        double totalAmount
) {
}
