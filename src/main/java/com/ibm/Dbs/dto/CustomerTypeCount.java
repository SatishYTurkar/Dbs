package com.ibm.Dbs.dto;

public class CustomerTypeCount {
    private String customerType;
    private Long customerCount;

    public CustomerTypeCount(String customerType, Long customerCount) {
        this.customerType = customerType;
        this.customerCount = customerCount;
    }

    // Getters and Setters

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Long getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(Long customerCount) {
        this.customerCount = customerCount;
    }
}