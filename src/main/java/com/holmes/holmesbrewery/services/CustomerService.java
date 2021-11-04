package com.holmes.holmesbrewery.services;

import com.holmes.holmesbrewery.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID customerId);

    Customer saveNewCustomer(Customer customer);

    void updateCustomer(UUID customerId, Customer customer);

    void deleteCustomerById(UUID customerId);
}
