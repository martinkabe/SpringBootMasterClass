package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    private final Long id;
    private final String name;

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonProperty("customer_id")
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
