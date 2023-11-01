package org.example;

import org.example.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();

        Product product1 = new Product(1, "Lenovo", 12500);
        Product product2 = new Product(2, "Casper", 11500);
        Product product3 = new Product(3, "Asus", 14500);

        products.add(product1);
        products.add(product2);
        products.add(product3);

        for (Product product : products
        ) {
            System.out.println("Ürün ismi: '" + product.getName() + "' ürün fiyatı: '" + product.getPrice() + "'");

        }


    }
}