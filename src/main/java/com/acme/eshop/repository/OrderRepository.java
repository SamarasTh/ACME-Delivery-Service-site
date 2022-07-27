package com.acme.eshop.repository;

import com.acme.eshop.model.Customer;
import com.acme.eshop.model.Order;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class OrderRepository implements CRUDRepository<Order, Long>{
    @Override
    public Order create(Order order) throws SQLException {
        return null;
    }

    @Override
    public List<Customer> createAll(Customer... customers) throws SQLException {
        return null;
    }

    @Override
    public List<Order> findAll() throws SQLException {
        return null;
    }

    @Override
    public Optional<Order> findByID(Long aLong) throws SQLException {
        return Optional.empty();
    }

    @Override
    public boolean update(Order order) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Order order) throws SQLException {
        return false;
    }
}
