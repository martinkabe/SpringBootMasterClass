package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    private final CustomerRepo repo;

    public CustomerService(@Qualifier("fake") CustomerRepo repo) {
        this.repo = repo;
    }

    public List<Customer> getCustomer() {
        return repo.getCustomers();
    }
}
