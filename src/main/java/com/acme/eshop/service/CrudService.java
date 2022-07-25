package com.acme.eshop.service;

import com.acme.eshop.utils.BusinessException;

import java.util.List;
import java.util.Optional;

public interface CrudService<T , ID> {

    void create(T t) throws BusinessException;

    List<T> findAll() throws BusinessException;

    Optional<T> findByID(ID id) throws BusinessException;

    boolean update(T t) throws BusinessException;

    boolean delete(T t) throws BusinessException;
}
