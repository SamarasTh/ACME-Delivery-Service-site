package com.acme.eshop.repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class OrderItemRepository implements  CRUDRepository{
    @Override
    public Object create(Object o) throws SQLException {
        return null;
    }

    @Override
    public List createAll(Object[] objects) throws SQLException {
        return null;
    }

    @Override
    public List findAll() throws SQLException {
        return null;
    }

    @Override
    public Optional findByID(Object o) throws SQLException {
        return Optional.empty();
    }

    @Override
    public boolean update(Object o) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Object o) throws SQLException {
        return false;
    }
}
