package com.acme.eshop;

import com.acme.eshop.repository.SqlRepository;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AcmeApplication {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(AcmeApplication.class);
    public static void main(String[] args) {



    }


    public void initializeDatabase() {
        logger.info("Initializing database tables (if they do not exist).");
        dropExistingTables();
        createInitialTables();
    }

    private void dropExistingTables() {
        //@formatter:off
        List.of(SqlRepository.get("drop.table.enrollment"),
                SqlRepository.get("drop.table.unit"),
                SqlRepository.get("drop.table.student"),
                SqlRepository.get("drop.table.department"),
                SqlRepository.get("drop.table.university")).forEach(c-> runTableCommands(c, true));
        //@formatter:on
    }

    private void createInitialTables() {
        //@formatter:off
        List.of(
                SqlRepository.get("create.table.university"),
                SqlRepository.get("create.table.department"),
                SqlRepository.get("create.table.student"),
                SqlRepository.get("create.table.unit"),
                SqlRepository.get("create.table.enrollment")).forEach(c-> runTableCommands(c, false));
    }
}
