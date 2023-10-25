package org.example.models;

public class Order {

    private int id;
    private int quantity;
    private String orderNotes;

    public Order(int id, int quantity, String orderNotes) {
        this.id = id;
        this.quantity = quantity;
        this.orderNotes = orderNotes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderNotes() {
        return orderNotes;
    }

    public void setOrderNotes(String orderNotes) {
        this.orderNotes = orderNotes;
    }
}
