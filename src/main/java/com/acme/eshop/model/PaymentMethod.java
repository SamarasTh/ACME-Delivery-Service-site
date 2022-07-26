package com.acme.eshop.model;

import javax.swing.*;
import java.math.BigDecimal;

public enum PaymentMethod {

    CASH ("0"),
    CARD("0.15"),
    WIRE_TRANSFER("0.10");

    PaymentMethod(String discount) {
    }



}
