package com.acme.eshop.repository;

import com.acme.eshop.model.Customer;
import com.acme.eshop.model.Order;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class OrderRepository implements CRUDRepository<Order, Long>{

    private  final org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public Order create(Order order) throws SQLException {
        try (Connection connection = DataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     SqlRepository.get("insert.table.order.000"), new String[]{"id"})) {

            logger.info("Creating order {}", order);

            preparedStatement.setString(1, order.getOrderDate());
            preparedStatement.setString(2, order.getOrderStatus());
            preparedStatement.setBigDecimal(3, order.getPrice());
            preparedStatement.setBigDecimal(4, order.getDiscount());
            preparedStatement.setObject(5, order.getPaymentMethod());
            preparedStatement.setString(6, order.getOrderItems().toString());
            preparedStatement.executeUpdate();

            // setting id
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            generatedKeys.next();
            order.setId(generatedKeys.getLong(1));

            return order;
        } catch (SQLException e) {
            throw new SQLException("Could not create order", e);
        }

    }

    @Override
    public List<Order> createAll(Order... orders) throws SQLException {
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
