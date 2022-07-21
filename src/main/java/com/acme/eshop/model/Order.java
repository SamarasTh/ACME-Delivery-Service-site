package com.acme.eshop.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int order_id;
    private double amount;
    List<OrderItem> orderItems = new ArrayList<>();
    private String status;


}
