package org.example.business;

import org.example.entities.Product;
import org.example.repository.ProductRepository;

public class ProductManager {

    ProductRepository productRepository;

    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void add(Product product) {
        if (product.getPrice() > 10000) {
            productRepository.add(product);
        }
    }
}
