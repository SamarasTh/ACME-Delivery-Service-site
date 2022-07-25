package com.acme.eshop;

import com.acme.eshop.model.Customer;
import com.acme.eshop.model.Product;
import com.acme.eshop.repository.SqlRepository;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AcmeApplication {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(AcmeApplication.class);
    public static void main(String[] args) {

        AcmeApplication   acmeApplication = new AcmeApplication();
        acmeApplication.customerCreation();
    }



    private List<Product> productCreation(){

        List<Product> products = List.of(
//                Product.builder().name("Samsung A5").price(556.5).type("Smartphone").build()
        );

        for (final Product product: products )
            logger.info("{}", product);

        return products;
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

}
