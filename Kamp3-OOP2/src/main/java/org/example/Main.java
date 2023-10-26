package org.example;

import org.example.business.ProductManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.entities.Product;
import org.example.repository.HibernateProductRepository;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1, "Iphone 15", 15000);


        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductRepository(), loggers);
        productManager.add(product1);

    }
}