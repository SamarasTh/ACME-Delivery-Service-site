package com.acme.eshop.model;

public class CustomerCategory extends Customer {

    private int customerCategoryId;
    private String categoryName;
    private String description;


    public CustomerCategory() {
    }

    public CustomerCategory(int customerCategoryId, String categoryName, String description){
        this.customerCategoryId = customerCategoryId;
        this.categoryName= categoryName;
        this.description= description;
    }

    public int getCustomerCategoryId() {
        return customerCategoryId;
    }

    public void setCustomerCategoryId(int customerCategoryId) {
        this.customerCategoryId = customerCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
