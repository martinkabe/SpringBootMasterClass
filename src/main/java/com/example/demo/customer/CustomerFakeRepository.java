package com.example.demo.customer;

import com.example.demo.exception.NotFoundException;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Martin", "password1", "email1"),
                new Customer(2L, "Kingsey", "password2", "email2"),
                new Customer(3L, "Rimta", "password3", "email3")
        );
    }

    @Override
    public Customer getCustomer(Long id) {
        return getCustomers()
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Customer with id " + id + " doesn't exist"));
    }
}
