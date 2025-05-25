package com.tor.inventory.service;

import com.tor.inventory.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAllProducts();

    Optional<Product> getProductById(Long id);

    Product createProduct(Product product);

    Product updateProduct(Long id, Product productDetails);

    void deleteProduct(Long id);

}
