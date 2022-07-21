package com.acme.eshop.model;

public class Discount {

    private int discountId;
    private double discountPercent;


    public Discount(){

    };

    public Discount(int discountId,double discountPercent){
        this.discountId =discountId;
        this.discountPercent=discountPercent;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }


}
