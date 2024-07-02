package com.ibm.Dbs.repository;

import com.ibm.Dbs.dto.CustomerTypeCount;
import com.ibm.Dbs.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT new com.ibm.Dbs.dto.CustomerTypeCount(c.customerType, COUNT(c)) " +
            "FROM Customer c GROUP BY c.customerType")
    List<CustomerTypeCount> countCustomersByType();

    List<Customer> findByCustomerNo(String customerNo);
}