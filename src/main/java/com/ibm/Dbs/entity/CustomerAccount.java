package com.ibm.Dbs.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "CustomerAccount", schema = "dbs")
public class CustomerAccount {


    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_No")
    private String customerNo;

    @Column(name = "account_No")
    private String accountNo;

    @Column(name = "balance")
    private String balance;

    public CustomerAccount() {
    }

    public CustomerAccount(String customerNo, String accountNo, String balance) {
        this.customerNo = customerNo;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}


