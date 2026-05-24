package com.blog.microscommunication.restclient.controller;

import com.blog.microscommunication.restclient.dto.OrderRequest;
import com.blog.microscommunication.restclient.dto.OrderResponse;
import com.blog.microscommunication.restclient.dto.ProductResponse;
import com.blog.microscommunication.restclient.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/products/{productId}")
    public ProductResponse getProductForOrder(@PathVariable Long productId) {
        return orderService.getProductForOrder(productId);
    }

    @PostMapping
    public OrderResponse createOrder(@RequestBody OrderRequest request) {
        return orderService.createOrder(request);
    }
}
