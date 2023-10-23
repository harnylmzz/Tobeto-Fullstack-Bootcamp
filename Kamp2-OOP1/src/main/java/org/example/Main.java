package org.example;

public class Main {
    public static void main(String[] args) {

        // Ürünleri oluşturuyoruz
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        // Ürün 1'in bilgilerini dolduruyoruz
        product1.name = "Delonghi Kahve Makinesi";
        product1.price = 7500;
        product1.discount = 7;
        product1.unitInStock = 3;
        product1.imageUrl = "image.jpg";

        // Ürün 2'nin bilgilerini dolduruyoruz
        product2.name = "Arçelik Kahve Makinesi";
        product2.price = 6500;
        product2.discount = 8;
        product2.unitInStock = 5;
        product2.imageUrl = "image1.jpg";

        // Ürün 3'ün bilgilerini dolduruyoruz
        product3.name = "Kitchen Kahve Makinesi";
        product3.price = 4500;
        product3.discount = 2;
        product3.unitInStock = 6;
        product3.imageUrl = "image3.jpg";


        System.out.println(product1.name);
        System.out.println(product2.name);
        System.out.println(product3.name);

        System.out.println("-------------------------");

        //Array
        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.name);

        }
    }
}
