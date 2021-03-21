package com.example.demo.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @GetMapping("/")
    public Customer getCustomer() {
        return new Customer(1L, "Martin");
    }
}
