package com.blog.communication.productservice.service;

import com.blog.communication.productservice.dto.ProductRequest;
import com.blog.communication.productservice.dto.ProductResponse;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    ProductResponse createProduct(ProductRequest request);
    ProductResponse getProduct(Long id);
}
