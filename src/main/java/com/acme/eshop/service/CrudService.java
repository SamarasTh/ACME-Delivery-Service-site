package com.acme.eshop.service;



import com.acme.eshop.repository.CrudRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface CrudService<T , ID>   {

    void create(T t) throws SQLException;

    List<T> findAll() throws SQLException;

    Optional<T> findByID(ID id) throws SQLException;

    boolean update(T t) throws SQLException;

    boolean delete(T t) throws SQLException;
}
