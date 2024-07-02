package com.ibm.Dbs.service;


import com.ibm.Dbs.entity.CustomerAccount;
import com.ibm.Dbs.repository.CustomerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    CustomerAccountRepository customerAccountRepository;

    public List<CustomerAccount> findCustomerAccountByCustomerNo(String customerNo) {
        System.out.println("in service customerNo" + customerNo);

        return customerAccountRepository.findByCustomerNo(customerNo);
    }

}
