package com.acme.eshop.model;

public class Customer {
    private int customerId;
    private String fName;
    private String lName;
    private Long phone;
    private String address;
    private String email;

    public Customer(int id, String fName, String lName, Long phone, String address, String email){
        this.customerId=id;
        this.fName = fName;
        this.lName = lName;
        this.phone=phone;
        this.address=address;
        this.email=email;
    }

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
