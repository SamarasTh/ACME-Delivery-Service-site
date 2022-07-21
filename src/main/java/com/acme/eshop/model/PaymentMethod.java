package com.acme.eshop.model;

public class PaymentMethod extends Payment{

    private int paymentMethodId;
    private String paymentType;

    public PaymentMethod(int paymentMethodId, String paymentType) {
        this.paymentMethodId = paymentMethodId;
        this.paymentType = paymentType;
    }

    public PaymentMethod(){
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}


