package com.example.th1_customer_management_orm.repository;

import com.example.th1_customer_management_orm.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    void save(Customer customer);

}
