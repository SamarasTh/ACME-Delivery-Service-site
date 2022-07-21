package com.acme.eshop.model;

public class PaymentMethod {

    private int paymentMethodID;
    private String paymentType;

    public PaymentMethod(int paymentMethodID, String paymentType) {
        this.paymentMethodID = paymentMethodID;
        this.paymentType = paymentType;
    }

    public PaymentMethod(){

    }

    public int getPaymentMethodID() {
        return paymentMethodID;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentMethodID(int paymentMethodID) {
        this.paymentMethodID = paymentMethodID;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}


