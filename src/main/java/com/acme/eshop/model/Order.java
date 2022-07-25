package com.acme.eshop.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class Order extends BaseModel{


    private List<OrderItem> orderItems = new ArrayList<>();
    private String orderDate;
    private String orderStatus ;


}
