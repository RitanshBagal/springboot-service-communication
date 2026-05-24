package com.blog.microscommunication.resttemplate.service;

import com.blog.microscommunication.resttemplate.dto.OrderRequest;
import com.blog.microscommunication.resttemplate.dto.OrderResponse;
import com.blog.microscommunication.resttemplate.dto.ProductResponse;
import org.springframework.http.ResponseEntity;

public interface OrderService {
    ResponseEntity<ProductResponse> getProductForOrder(Long productId);
    OrderResponse createOrder(OrderRequest request);
}
