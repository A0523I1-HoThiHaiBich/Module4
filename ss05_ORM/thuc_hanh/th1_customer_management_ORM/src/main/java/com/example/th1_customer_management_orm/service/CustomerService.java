package com.example.th1_customer_management_orm.service;

import com.example.th1_customer_management_orm.model.Customer;
import com.example.th1_customer_management_orm.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements  ICustomerService{
    @Autowired
    private ICustomerRepository repository;

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Customer customer) {
    repository.save(customer);
    }
}
