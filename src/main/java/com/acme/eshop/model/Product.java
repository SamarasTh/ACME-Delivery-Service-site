package com.acme.eshop.model;

public class Product {

    private int productId;
    private double price;
    private String name;

    public Product(){

    }

    public Product(int productId, double price, String name){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }

    public int getProductId(){
        return productId;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
