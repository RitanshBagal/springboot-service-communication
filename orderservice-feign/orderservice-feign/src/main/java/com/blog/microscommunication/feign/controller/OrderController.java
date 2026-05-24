package com.blog.microscommunication.feign.controller;

import com.blog.microscommunication.feign.dto.OrderRequest;
import com.blog.microscommunication.feign.dto.OrderResponse;
import com.blog.microscommunication.feign.dto.ProductResponse;
import com.blog.microscommunication.feign.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/products/{productId}")
    public ResponseEntity<ProductResponse> getProductForOrder(@PathVariable Long productId) {
        return ResponseEntity.ok(orderService.getProductForOrder(productId));
    }

    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest request) {
        return ResponseEntity.ok(orderService.createOrder(request));
    }
}
