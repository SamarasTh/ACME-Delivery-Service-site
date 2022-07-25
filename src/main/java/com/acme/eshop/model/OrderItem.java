package com.acme.eshop.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderItem  {
    private  Long orderId;
    private  Long productId;
    private BigDecimal price;
    private String name;
    private String type;



}
