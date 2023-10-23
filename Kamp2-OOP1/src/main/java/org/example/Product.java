package org.example;

public class Product {

    private String name;
    private double price;
    private double discount;
    private String imageUrl;
    private int unitInStock;


    public Product(String name, double price, double discount, String imageUrl, int unitInStock) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.imageUrl = imageUrl;
        this.unitInStock = unitInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

}
