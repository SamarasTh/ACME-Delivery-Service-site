package com.acme.eshop.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private List<OrderItem> orderItems = new ArrayList<>();
    private String orderDate;
    private String orderStatus ;

    public Order(){

    }
    public Order(int orderId, List<OrderItem> orderItems, String orderDate, String orderStatus) {
        this.orderId = orderId;
        this.orderItems = orderItems;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
