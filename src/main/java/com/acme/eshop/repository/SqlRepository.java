package com.acme.eshop.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static java.lang.System.exit;


public class SqlRepository {
    private static final Logger logger = LoggerFactory.getLogger(SqlRepository.class);
    private static final Properties sqlCommands = new Properties();

    // parse sql queries once for the whole run
    static {
        try (InputStream inputStream = SqlRepository.class.getClassLoader().getResourceAsStream(
                "sql.properties")) {
            if (inputStream == null) {
                logger.info("Sorry, unable to find sql.properties, exiting application.");
                // Abnormal exit
                exit(-1);
            }

            //load a properties file from class path, inside static method
            sqlCommands.load(inputStream);
        } catch (IOException ex) {
            logger.info("Sorry, unable to parse sql.properties, exiting application.", ex);
            // Abnormal exit
            exit(-1);
        }
    }

    private SqlRepository() {
    }

    public static String get(String commandKey) {
        return sqlCommands.getProperty(commandKey);
    }
}

