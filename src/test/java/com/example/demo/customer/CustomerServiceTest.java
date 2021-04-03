package com.example.demo.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class CustomerServiceTest {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerService underTest;

    private void storeCustomers() {
        Customer martin = new Customer(1L, "Martin", "nitram", "martin@gmail.com");
        Customer igor = new Customer(2L, "Igor", "igor", "igor@gmail.com");
        customerRepository.saveAll(Arrays.asList(martin, igor));
    }

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
        storeCustomers();
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        List<Customer> customers = underTest.getCustomers();
        assertEquals(2, customers.size());
    }

    @Test
    void getCustomer() {
        Customer customer = underTest.getCustomer(1L);
        assertEquals(1L, customer.getId());
        assertEquals("Martin", customer.getName());
        assertEquals("martin@gmail.com", customer.getEmail());
        assertEquals("nitram", customer.getPassword());
    }
}