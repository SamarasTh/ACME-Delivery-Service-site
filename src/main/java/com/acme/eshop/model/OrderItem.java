package com.acme.eshop.model;

public class OrderItem {

    private int orderItem_id;
    private int quantity;

    public OrderItem(int orderItem_id, int quantity) {
        this.orderItem_id = orderItem_id;
        this.quantity = quantity;
    }

    private OrderItem(){

    }

    public int getOrderItem_id() {
        return orderItem_id;
    }

    public void setOrderItem_id(int orderItem_id) {
        this.orderItem_id = orderItem_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
