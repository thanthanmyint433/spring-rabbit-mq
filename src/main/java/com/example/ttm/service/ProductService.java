package com.example.ttm.service;

import com.example.ttm.commands.ProductForm;
import com.example.ttm.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);

    void sendProductMessage(String id);
}
