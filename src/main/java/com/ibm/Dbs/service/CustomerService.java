package com.ibm.Dbs.service;


import com.ibm.Dbs.dto.CustomerTypeCount;
import com.ibm.Dbs.entity.Customer;
import com.ibm.Dbs.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public List<CustomerTypeCount> countCustomersByType() {
        return customerRepository.countCustomersByType();
    }

    public List<Customer> findByCustomerNo(String customerNo) {
        return customerRepository.findByCustomerNo(customerNo);
    }


    public List<String> getAllCustomerNumbers() {
        List<Customer> customers = customerRepository.findAll();
        return customers.stream()
                .map(Customer::getCustomerNo)
                .collect(Collectors.toList());
    }


  /*  public List<Customer> getCustomersByType(String type) {
        return customerRepository.findByCustomerType(type);
    }

    public List<Customer> getCustomerByNo(String customerNo) {
        return customerRepository.findByCustomerNo(customerNo);
    }*/
}