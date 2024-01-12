package com.example.th1_customer_management_orm.service;

import com.example.th1_customer_management_orm.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer student);
}
