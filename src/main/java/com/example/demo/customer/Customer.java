package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Customer {
    @Id
    private Long id;

    @NotBlank(message = "name field cannot be blank")
    private String name;

    @NotBlank(message = "password field cannot be blank")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotNull(message = "email field cannot be empty")
    @NotBlank(message = "email field cannot be blank")
    @Email(message = "invalid email field")
    private String email;

    public Customer(Long id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public Customer() { }

    @JsonProperty("customer_id")
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }
}
