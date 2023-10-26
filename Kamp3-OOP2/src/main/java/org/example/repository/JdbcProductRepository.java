package org.example.repository;

import org.example.entities.Product;

public class JdbcProductRepository implements ProductRepository {
    public void add(Product product) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
