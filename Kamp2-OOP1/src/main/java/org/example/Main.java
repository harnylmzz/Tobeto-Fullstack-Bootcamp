package org.example;

public class Main {
    public static void main(String[] args) {

        // Bireysel müşteri oluşturuyoruz
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345678910");
        individualCustomer.setFirstName("John");
        individualCustomer.setLastName("Doe");
        individualCustomer.setPhone("0523697846541");

        // Kurumsal müşteri oluşturuyoruz
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCustomerNumber("78945612");
        corporateCustomer.setCompanyName("Batarya Company");
        corporateCustomer.setTaxNumber("1236547891");
        corporateCustomer.setPhone("0578945612");

        Customer[] customers = {individualCustomer, corporateCustomer};
        for (Customer customer : customers) {
            System.out.println(customer.getCustomerNumber());
        }

        // Ürünleri oluşturuyoruz
        Product product1 = new Product("Delongi Kahve Makinesi", 7500, 3, "image.jpg", 3);
        Product product2 = new Product("Arçelik Kahve Makinesi", 6500, 5, "image2.url", 5);
        Product product3 = new Product("Kitchen Kahve Makinesi", 3500, 9, "image3.url", 7);

        /*
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7500);
        product1.setUnitInStock(3);
        product1.setDiscount(7);
        product1.setImageUrl("image.jpg");

        product1.setName("Arçelik Kahve Makinesi");
        product1.setDiscount(7500);
        product1.setUnitInStock(3);
        product1.setDiscount(7);
        product1.setImageUrl("image2.jpg");

        product1.setName("Kitchen Kahve Makinesi");
        product1.setDiscount(7500);
        product1.setUnitInStock(3);
        product1.setDiscount(7);
        product1.setImageUrl("image3.jpg");

         */

        /*

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

        */


        //Array
        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());

        }
    }
}
