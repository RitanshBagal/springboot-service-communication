package com.blog.microscommunication.restclient.service.impl;

import com.blog.microscommunication.restclient.dto.OrderRequest;
import com.blog.microscommunication.restclient.dto.OrderResponse;
import com.blog.microscommunication.restclient.dto.ProductResponse;
import com.blog.microscommunication.restclient.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final RestClient restClient;

    @Override
    public ProductResponse getProductForOrder(Long productId) {
        return restClient.get()
                .uri("http://localhost:8081/api/v1/products/{id}", productId)
                .retrieve()
                .body(ProductResponse.class);
    }

    @Override
    public OrderResponse createOrder(OrderRequest request) {
        ProductResponse product = getProductForOrder(request.productId());

        double totalAmount = product.price()*request.quantity();

        return new OrderResponse(
                101L,
                product.id(),
                product.name(),
                request.quantity(),
                product.price(),
                totalAmount
        );
    }
}
