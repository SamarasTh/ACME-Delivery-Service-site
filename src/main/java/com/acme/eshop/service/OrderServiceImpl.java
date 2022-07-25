package com.acme.eshop.service;

import com.acme.eshop.model.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderServiceImpl implements OrderService {


    @Override
    public Order createOrder(List<Product> products, Customer customer, PaymentMethod paymentMethod) {

        Order.builder()
                .orderDate((new Date()).toString())
                .orderStatus("PENDING")
                .build();

        return null;
    }

    private BigDecimal calculateTotalPrice(List<Product> products) {
        BigDecimal productPrice = BigDecimal.ZERO;
        for (Product product :products) {
            productPrice.add(product.getPrice())  ;
        }
        return null;
    }

    private  BigDecimal calculateDiscount(CustomerCategory cc, PaymentMethod pm ){

        BigDecimal pmDiscount = BigDecimal.valueOf(Double.valueOf(pm.name()));
        BigDecimal ccDiscount = BigDecimal.valueOf(Double.valueOf(cc.name()));
        return pmDiscount.add(ccDiscount);
    }
}
