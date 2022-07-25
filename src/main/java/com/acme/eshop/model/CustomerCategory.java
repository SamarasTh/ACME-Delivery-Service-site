package com.acme.eshop.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;


public enum CustomerCategory {


    B2C (BigDecimal.ZERO),
    B2B(new BigDecimal(0.2)),
    B2G(new BigDecimal(0.5));

    CustomerCategory(BigDecimal discount) {

    }
}
