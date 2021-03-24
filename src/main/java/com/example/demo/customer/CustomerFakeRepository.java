package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Martin"),
                new Customer(2L, "Kingsey"),
                new Customer(2L, "Rimta")
        );
    }

    @Override
    public Customer getCustomer(Long id) {
        return getCustomers()
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Customer with id " + id + " doesn't exist"));
    }
}
