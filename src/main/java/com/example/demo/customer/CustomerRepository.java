package com.example.demo.customer;

import java.util.Collections;
import java.util.List;


public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        // TODO connect to real db
        return Collections.singletonList(
                new Customer(1L, "TODO. Implement real db", "somepwd", "email1")
        );
    }

    @Override
    public Customer getCustomer(Long id) {
        // TODO connect to real db
        return new Customer(1L, "TODO. Implement real db", "somepwd2", "email2");
    }
}
