package com.example.demo.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo repo;

    public CustomerService(CustomerRepo repo) {
        this.repo = repo;
    }

    public List<Customer> getCustomers() {
        return repo.getCustomers();
    }

    public Customer getCustomer(Long id) {
        return repo.getCustomer(id);
    }
}
