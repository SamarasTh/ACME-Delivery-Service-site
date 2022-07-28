package com.acme.eshop;

import com.acme.eshop.model.Customer;
import com.acme.eshop.model.Order;
import com.acme.eshop.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

public class AcmeApplication {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {

//         OrderServiceImpl   orderService;
//
//        AcmeApplication   acmeApplication = new AcmeApplication();
//        acmeApplication.customerCreation();
//        acmeApplication.productCreation();

    }


    private List<Customer> customerCreation() {
        // @formatter:off
        List<Customer> customers = List.of(
                Customer.builder().name("Thanos Sam").username("Nossam").password("1231123").address("Venizelou 12").email("test@test.com").build(),
                Customer.builder().name("Argiris").username("Argy").password("5645435345").address("Venizelou 13").email("notest@test.com").build(),
                Customer.builder().name("Nikos").username("NikTheGreek").password("345345").address("Venizelou 14").email("dummy@test.com").build(),
                Customer.builder().name("Maria").username("Marion123").password("1231").address("Venizelou 15").email("sandbox@test.com").build(),
                Customer.builder().name("Dimitra").username("Dimi").password("678678").address("Venizelou 16").email("noemail@test.com").build(),
                Customer.builder().name("Euagelia").username("Eua123").password("12fdsfd31123").address("Venizelou 17").email("emailname@test.com").build(),
                Customer.builder().name("Viktoria").username("Vik").password("fhh45345").address("Venizelou 18").email("emailer@test.com").build(),
                Customer.builder().name("Aggelos").username("Angel").password("dgdg24").address("Venizelou 19").email("devemail@test.com").build(),
                Customer.builder().name("Takis").username("Takis123").password("dfhdh234").address("Venizelou 21").email("passemail@test.com").build(),
                Customer.builder().name("Nikos Koukos").username("FOUSEKIS").password("sdfs1214d1").address("Venizelou 23").email("pseudoemail@test.com").build(),
                Customer.builder().name("Thesalia").username("Thess").password("d1224tgbb").address("Venizelou 24").email("fakee_email@test.com").build(),
                Customer.builder().name("Nikitas").username("niki12").password("343hb54").address("Venizelou 26").email("gamil@test.com").build(),
                Customer.builder().name("Kostas").username("Kotsos1").password("bvfb456").address("Venizelou 27").email("amazon@test.com").build(),
                Customer.builder().name("Mpampis").username("Kyfonidis").password("fg343").address("Venizelou 25").email("verizon@test.com").build(),
                Customer.builder().name("Sergios").username("Serj").password("gfdj456357ad").address("Venizelou 28").email("nopo@test.com").build());

        // @formatter:on
        for (final Customer customer : customers) {
            logger.info("{}", customer);
        }
        return customers;
    }

    private List<Product> productCreation() {

        List<Product> products = List.of(
                Product.builder().name("Samsung A5").price(BigDecimal.valueOf(230.50)).type("Smartphone").build(),
                Product.builder().name("Razer Deathadder").price(BigDecimal.valueOf(25.50)).type("Mouse").build(),
                Product.builder().name("Hitachi AG43").price(BigDecimal.valueOf(230.50)).type("A/C").build(),
                Product.builder().name("Samsung Galaxy S20").price(BigDecimal.valueOf(1000.10)).type("Smartphone").build(),
                Product.builder().name("iPhone 13 Pro").price(BigDecimal.valueOf(1230)).type("Smartphone").build(),
                Product.builder().name("Dell Inspiron 4450").price(BigDecimal.valueOf(650.50)).type("Laptop").build(),
                Product.builder().name("Nikkon G54").price(BigDecimal.valueOf(230.50)).type("DSLR Camera").build(),
                Product.builder().name("CoolerMaster Thrust").price(BigDecimal.valueOf(50)).type("Keyboard").build(),
                Product.builder().name("GoPro 7").price(BigDecimal.valueOf(690)).type("Action Camera").build(),
                Product.builder().name("Xiaomi SmartMic").price(BigDecimal.valueOf(260.50)).type("Microphone").build(),
                Product.builder().name("Razer 34").price(BigDecimal.valueOf(150.12)).type("headset").build(),
                Product.builder().name("Samsung A4").price(BigDecimal.valueOf(330.50)).type("Smartphone").build(),
                Product.builder().name("iPhone 6").price(BigDecimal.valueOf(530.50)).type("Smartphone").build(),
                Product.builder().name("RX570 Sapphire Nitro").price(BigDecimal.valueOf(330.50)).type("GPU").build()
        );

        for (final Product product : products)
            logger.info("{}", product);

        return products;
    }

    private List<Order> orderCreation() {
        List<Order> orders = List.of(
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(660.10)).discount(BigDecimal.valueOf(0.10)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(3152.10)).discount(BigDecimal.valueOf(0.25)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(2111.10)).discount(BigDecimal.valueOf(0.25)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(1500.10)).discount(BigDecimal.valueOf(0.20)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(989.10)).discount(BigDecimal.valueOf(0.55)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(765.10)).discount(BigDecimal.valueOf(0.65)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(765.10)).discount(BigDecimal.valueOf(0.35)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(899.10)).discount(BigDecimal.valueOf(0.15)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(987.10)).discount(BigDecimal.valueOf(0.15)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(788.10)).discount(BigDecimal.valueOf(0.15)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(1000.10)).discount(BigDecimal.valueOf(0.35)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(678.10)).discount(BigDecimal.valueOf(0.45)).build(),
                Order.builder().orderDate("22-05-22").orderStatus("completed").price(BigDecimal.valueOf(250.23)).discount(BigDecimal.valueOf(0.50)).build()
        );

        for (final Order order : orders)
            logger.info("{}", order);

        return orders;
    }

}
