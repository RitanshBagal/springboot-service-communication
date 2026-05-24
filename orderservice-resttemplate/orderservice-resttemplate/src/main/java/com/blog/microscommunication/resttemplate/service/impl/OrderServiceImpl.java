package com.blog.microscommunication.resttemplate.service.impl;

import com.blog.microscommunication.resttemplate.dto.OrderRequest;
import com.blog.microscommunication.resttemplate.dto.OrderResponse;
import com.blog.microscommunication.resttemplate.dto.ProductResponse;
import com.blog.microscommunication.resttemplate.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderResponse createOrder(OrderRequest request) {
        ResponseEntity<ProductResponse> product = getProductForOrder(request.productId());

        double totalAmount = product.getBody().price()*request.quantity();

        return new OrderResponse(
          101l,
          product.getBody().id(),
                product.getBody().name(),
                request.quantity(),
                product.getBody().price(),
                totalAmount
        );
    }

    private final RestTemplate restTemplate;
    @Override
    public ResponseEntity<ProductResponse> getProductForOrder(Long productId) {
        String url = "http://localhost:8081/api/v1/products/" + productId;

        return restTemplate.getForEntity(
                url,
                ProductResponse.class
        );
    }
}
