package org.example.products;

public class Product {
    private String name;
    private int id;
    private double price;
    private int quantity;

    public Product(int id,String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setId(int id) {
        this.id = id;
    }
}
