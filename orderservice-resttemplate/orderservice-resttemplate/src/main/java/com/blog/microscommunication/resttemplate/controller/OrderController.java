package com.blog.microscommunication.resttemplate.controller;

import com.blog.microscommunication.resttemplate.dto.OrderRequest;
import com.blog.microscommunication.resttemplate.dto.OrderResponse;
import com.blog.microscommunication.resttemplate.dto.ProductResponse;
import com.blog.microscommunication.resttemplate.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/products/{productId}")
    public ResponseEntity<ProductResponse> getProductForOrder(@PathVariable Long productId){
        return orderService.getProductForOrder(productId);
    }

    @PostMapping
    public OrderResponse createOrder(@RequestBody OrderRequest request){
        return orderService.createOrder(request);
    }


}
