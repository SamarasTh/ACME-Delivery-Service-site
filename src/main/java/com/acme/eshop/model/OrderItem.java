package com.acme.eshop.model;

public class OrderItem extends Product {

    private int orderItemId;
    private int quantity;

    public OrderItem(int orderItemId, int quantity) {
        this.orderItemId = orderItemId;
        this.quantity = quantity;
    }

    private OrderItem(){

    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
