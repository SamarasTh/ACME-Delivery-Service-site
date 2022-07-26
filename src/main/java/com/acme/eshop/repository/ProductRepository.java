package com.acme.eshop.repository;

import com.acme.eshop.model.Customer;
import com.acme.eshop.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ProductRepository implements CRUDRepository<Product, Long> {

    private static final Logger logger = LoggerFactory.getLogger(ProductRepository.class);

    @Override
    public Product create(Product product) throws SQLException {
        try (Connection connection = DataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     SqlRepository.get("insert.table.product.000"), new String[]{"id"})) {

            logger.info("Creating product {}", product);

            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getType());
            preparedStatement.setBigDecimal(3, product.getPrice());

            preparedStatement.executeUpdate();

            // set  id
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            generatedKeys.next(); // we only suppose that there is a single generated key
            product.setId(generatedKeys.getLong(1));

            return product;
        } catch (SQLException e) {
            throw new SQLException("Could not create Product", e);
        }
    }

    @Override
    public List<Product> findAll() throws SQLException {
        return null;
    }

    @Override
    public Optional<Product> findByID(Long aLong) throws SQLException {
        return Optional.empty();
    }

    @Override
    public boolean update(Product product) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Product product) throws SQLException {
        return false;
    }


}
