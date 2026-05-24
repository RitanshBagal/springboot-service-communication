package com.blog.microscommunication.feign.service;

import com.blog.microscommunication.feign.dto.OrderRequest;
import com.blog.microscommunication.feign.dto.OrderResponse;
import com.blog.microscommunication.feign.dto.ProductResponse;

public interface OrderService {
    ProductResponse getProductForOrder(Long productId);

    OrderResponse createOrder(OrderRequest request);
}
