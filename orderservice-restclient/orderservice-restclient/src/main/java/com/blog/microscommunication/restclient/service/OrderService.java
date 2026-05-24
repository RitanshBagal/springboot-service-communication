package com.blog.microscommunication.restclient.service;

import com.blog.microscommunication.restclient.dto.OrderRequest;
import com.blog.microscommunication.restclient.dto.OrderResponse;
import com.blog.microscommunication.restclient.dto.ProductResponse;

public interface OrderService {
    ProductResponse getProductForOrder(Long productId);

    OrderResponse createOrder(OrderRequest request);
}
