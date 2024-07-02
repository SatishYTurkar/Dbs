package com.ibm.Dbs.controller;

import com.ibm.Dbs.dto.CustomerTypeCount;
import com.ibm.Dbs.entity.Customer;
import com.ibm.Dbs.entity.CustomerAccount;
import com.ibm.Dbs.service.AccountService;
import com.ibm.Dbs.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(
        origins = {
                "*"
        },
        methods = {
                RequestMethod.OPTIONS,
                RequestMethod.GET,
                RequestMethod.PUT,
                RequestMethod.DELETE,
                RequestMethod.POST
        })
@RestController

public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private AccountService accountService;

    @GetMapping("/getallcustomers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/allcustomernumbers")
    public List<String> getAllCustomerNumbers() {
        return customerService.getAllCustomerNumbers();
    }

    @GetMapping("/getCustomerGroupBytype")
    public List<CustomerTypeCount> countCustomersByType() {
        return customerService.countCustomersByType();
    }

    @GetMapping("/searchByCustomerNo")
    public List<Customer> searchByCustomerNo(@RequestParam("customerNo") String customerNo) {
        return customerService.findByCustomerNo(customerNo);
    }

    @GetMapping("/accountDetailsByCustNo")
    public List<CustomerAccount> accountDetailsByCustNo(@RequestParam("customerNo") String customerNo) {

        System.out.println("in controller customerNo" + customerNo);
        return accountService.findCustomerAccountByCustomerNo(customerNo);
    }

    @GetMapping("/login")
    public String methodlogin() {
        return "login";  //pending login feaures
    }

}
