package com.acme.eshop.service;

import com.acme.eshop.model.Product;
import com.acme.eshop.repository.CRUDRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements CRUDRepository {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(ProductServiceImpl.class);



    @Override
    public Object create(Object o) throws SQLException {
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
