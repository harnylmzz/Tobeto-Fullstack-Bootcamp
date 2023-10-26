package org.example.business;

import org.example.core.logging.Logger;
import org.example.entities.Product;
import org.example.repository.HibernateProductRepository;
import org.example.repository.JdbcProductRepository;
import org.example.repository.ProductRepository;

import java.util.List;

public class ProductManager {
    private ProductRepository productRepository;
    private Logger[] loggers;

    public ProductManager(ProductRepository productRepository, Logger[] loggers) {
        this.productRepository = productRepository;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10TL'den küçük olamaz!");
        }

        // ProductRepository productRepository = new HibernateProductRepository();
        productRepository.add(product);

        for (Logger logger : loggers
        ) {
            logger.log(product.getName());

        }
    }
}
