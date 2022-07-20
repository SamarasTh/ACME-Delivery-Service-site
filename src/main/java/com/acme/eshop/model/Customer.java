package com.acme.eshop.model;

public class Customer {
    private int customerId;
    private String fname;
    private String lname;
    private long phone;
    private String address;

    Customer(int id,String fname, String lname, long phone,String address){
        this.customerId=id;
        this.fname=fname;
        this.lname=lname;
        this.phone=phone;
        this.address=address;
    }

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }
}
