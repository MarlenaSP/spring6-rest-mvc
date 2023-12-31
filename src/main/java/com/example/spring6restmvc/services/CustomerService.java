package com.example.spring6restmvc.services;

import com.example.spring6restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID uuid);
    List<Customer> getAllCustomers();
}
