package com.acme.eshop.model;

public class Payment {
    private int paymentID;
    private double amount;

    public Payment(int paymentID, double amount) {
        this.paymentID = paymentID;
        this.amount = amount;
    }

    public Payment(){

    }

    public int getPaymentID() {
        return paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
