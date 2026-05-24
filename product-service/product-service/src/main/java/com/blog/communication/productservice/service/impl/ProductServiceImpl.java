package com.blog.communication.productservice.service.impl;

import com.blog.communication.productservice.dto.ProductRequest;
import com.blog.communication.productservice.dto.ProductResponse;
import com.blog.communication.productservice.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private final Map<Long, ProductResponse> products = new HashMap<>();

    @Override
    public ProductResponse createProduct(ProductRequest request) {

        ProductResponse response =
                new ProductResponse(
                        request.id(),
                        request.name(),
                        request.price()
                );

        products.put(request.id(), response);

        return response;
    }

    @Override
    public ProductResponse getProduct(Long id) {

        return products.get(id);
    }
}
