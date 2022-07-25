package com.acme.eshop.service;

import com.acme.eshop.model.Customer;
import com.acme.eshop.model.Order;
import com.acme.eshop.model.PaymentMethod;
import com.acme.eshop.model.Product;

import java.util.List;

public interface OrderService {

    Order createOrder(List<Product> products, Customer customer, PaymentMethod paymentMethod);


}
