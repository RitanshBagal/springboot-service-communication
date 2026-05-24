package com.blog.microscommunication.feign.service.impl;

import com.blog.microscommunication.feign.client.ProductClient;
import com.blog.microscommunication.feign.dto.OrderRequest;
import com.blog.microscommunication.feign.dto.OrderResponse;
import com.blog.microscommunication.feign.dto.ProductResponse;
import com.blog.microscommunication.feign.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final ProductClient productClient;
    @Override
    public ProductResponse getProductForOrder(Long productId) {
        return productClient.getProductById(productId);
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
