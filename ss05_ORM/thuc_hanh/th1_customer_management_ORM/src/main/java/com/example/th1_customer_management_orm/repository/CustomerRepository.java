package com.example.th1_customer_management_orm.repository;

import com.example.th1_customer_management_orm.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Customer> findAll() {
        String sql= "select c from Customer c";
        TypedQuery<Customer> query= entityManager.createQuery(sql,Customer.class);

        return query.getResultList();
    }

    @Override
    @Transactional
    public void save(Customer customer) {
    entityManager.persist(customer);
    }
}
