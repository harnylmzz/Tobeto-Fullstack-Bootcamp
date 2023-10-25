package org.example;

import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {

        //user

        User user1 = new User(1, "Wulf", "Dorn", "dornwulf@gmail.com");
        User user2 = new User(2, "Stephen", "King", "kingstephen@outlook.com");
        User user3 = new User(3, "George", "Orwell", "orwellgeorge@outlook.com");
        User user4 = new User(4, "Victor", "Hugo", "hugovictor@gmail.com");


        //category
        Category category1 = new Category(1, "Fast Food");
        Category category2 = new Category(2, "Pizza");
        Category category3 = new Category(2, "Pizza");
        Category category4 = new Category(1, "Fast Food");


        //product
        Product product1 = new Product(1, "McDonalds");
        Product product2 = new Product(2, "Domino's");
        Product product3 = new Product(3, "Little Caesars");
        Product product4 = new Product(2, "Domino's");


        //order
        Order order1 = new Order(1, 2, "Can be fast?");
        Order order2 = new Order(2, 1, "I don't wanna sauce.");
        Order order3 = new Order(3, 3, "I wanna extra hot sauce, please.");
        Order order4 = new Order(2, 1, "I don't want fork and spoon.");


    }
}