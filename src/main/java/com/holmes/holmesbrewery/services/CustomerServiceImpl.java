package com.holmes.holmesbrewery.services;

import com.holmes.holmesbrewery.services.CustomerService;
import com.holmes.holmesbrewery.web.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(UUID customerId) {
        return Customer.builder()
                .id(UUID.randomUUID())
                .name("Matt Holmes")
                .build();
    }

    @Override
    public Customer saveNewCustomer(Customer customer) {
        return Customer.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, Customer customer) {
        // TODO impl = add to update customer
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("deleting a customer...");
    }
}
