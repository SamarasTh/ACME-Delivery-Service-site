package com.acme.eshop.repository;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {

        private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";

        private static final String USERNAME = "sys";
        private static final String PASSWORD = "pass";

        private static final HikariDataSource hikariDataSource;

        // initialize the pool with the applied configuration only once
        static {
            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(DB_URL);
            config.setUsername(USERNAME);
            config.setPassword(PASSWORD);

            // This property controls the maximum number of milliseconds that a client (that's you) will wait for a
            // connection from the pool.
            config.setConnectionTimeout(10000);
            config.setAutoCommit(true);

            config.addDataSourceProperty("maximumPoolSize", "10");
            config.addDataSourceProperty("minimumIdle", "2");
            config.addDataSourceProperty("idleTimeout", "10000");

            hikariDataSource = new HikariDataSource(config);
        }

        private DataSource() {
        }

        public static Connection getConnection() throws SQLException {
            return hikariDataSource.getConnection();
        }
    }

