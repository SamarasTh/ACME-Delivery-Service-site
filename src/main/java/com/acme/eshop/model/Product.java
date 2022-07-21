package com.acme.eshop.model;

public class Product {

    private int product_id;
    private double price;
    private String name;

    public Product(int product_id, double price, String name) {
        this.product_id = product_id;
        this.price = price;
        this.name = name;
    }

    public Product(){

    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
