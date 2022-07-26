package com.acme.eshop.service;

import com.acme.eshop.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderServiceImpl implements OrderService {


    @Override
    public Order createOrder(List<Product> products, Customer customer, PaymentMethod paymentMethod) {

        Order order = Order.builder()
                .orderDate((new Date()).toString())
                .orderStatus("PENDING")
                .price(calculatePriceAfterDiscount(products, customer.getCustomerCategory() , paymentMethod ))
                .discount(calculateDiscount(customer.getCustomerCategory(), paymentMethod))
                .paymentMethod(paymentMethod)
                .build();
        return order;
    }

    private BigDecimal calculatePriceAfterDiscount(List<Product> products, CustomerCategory cc, PaymentMethod pm) {
        BigDecimal discount = calculateDiscount(cc, pm);
        BigDecimal priceBeforeDiscount = calculatePriceBeforeDiscount(products);
        BigDecimal priceAfterDiscount = priceBeforeDiscount.subtract(priceBeforeDiscount.multiply(discount));

        return priceAfterDiscount;
    }

    private BigDecimal calculatePriceBeforeDiscount(List<Product> products) {
        BigDecimal priceBeforeDiscount = BigDecimal.ZERO;
        for (Product product : products) {
            priceBeforeDiscount.add(product.getPrice());
        }
        return priceBeforeDiscount;
    }


    private BigDecimal calculateDiscount(CustomerCategory cc, PaymentMethod pm) {

        BigDecimal pmDiscount = BigDecimal.valueOf(Double.valueOf(pm.name()));
        BigDecimal ccDiscount = BigDecimal.valueOf(Double.valueOf(cc.name()));
        BigDecimal totalDiscount = pmDiscount.add(ccDiscount);
        return totalDiscount;
    }

    private List<OrderItem>  convertProductsToOrderItems(List<Product> products, Long orderId){
        List<OrderItem> orderItems  = new ArrayList<>();
        products.stream().forEach( product -> {
                orderItems.add(convertProductToOrderItem(product, orderId)) ;
            });


        return orderItems;
    }

    private OrderItem convertProductToOrderItem(Product product, Long orderId){

        return OrderItem.builder()
                .orderId(orderId)
                .productId(product.getId())
                .price(product.getPrice())
                .name(product.getName())
                .type(product.getType())
                .build();
    }
}
