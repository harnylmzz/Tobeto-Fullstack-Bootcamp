package org.example.repository;

import org.example.entities.Product;

public class HibernateProductRepository  implements ProductRepository{
    public void add(Product product) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
